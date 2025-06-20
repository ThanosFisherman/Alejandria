package com.epicness.alejandria.showcase.modules.fun;

import static com.epicness.alejandria.showcase.constants.FunConstants.BALLS;
import static com.epicness.alejandria.showcase.constants.FunConstants.SPACING;
import static com.epicness.alejandria.showcase.constants.FunConstants.VOLUME;
import static com.epicness.alejandria.showcase.constants.MusicIntervals.MAJOR_PENTATONIC_SCALE;
import static com.epicness.fundamentals.constants.SharedConstants.VIEWPORT_HALF_HEIGHT;
import static com.epicness.fundamentals.constants.SharedConstants.VIEWPORT_WIDTH;

import com.badlogic.gdx.math.MathUtils;
import com.epicness.alejandria.showcase.logic.Module;
import com.epicness.alejandria.showcase.stuff.modules.fun.BeepingBall;

public class BeepingBalls extends Module<BeepingBallsDrawable> {

    public BeepingBalls() {
        super("Some cool beeping balls", "Some cool beeping balls");
    }

    @Override
    public BeepingBallsDrawable setup() {
        drawable = new BeepingBallsDrawable(assets.getCircle(), assets.getCircleGlow());
        BeepingBall[] balls = drawable.getBalls();
        for (int i = 0; i < BALLS; i++) {
            BeepingBall ball = balls[i];
            ball.startingX = 100f + i * SPACING;
            ball.startingY = VIEWPORT_HALF_HEIGHT - i * SPACING;
            ball.finalX = VIEWPORT_WIDTH - 100f - i * SPACING;
            final float[] notes = MAJOR_PENTATONIC_SCALE;
            final int index = i % notes.length;
            ball.pitch = notes[index];
            ball.setOriginBasedPosition(ball.startingX, ball.startingY);
        }
        assets.getPads().setLooping(true);
        assets.getPads().play();
        return drawable;
    }

    @Override
    public void update(float delta) {
        BeepingBall[] balls = drawable.getBalls();
        for (int i = 0; i < BALLS; i++) {

            BeepingBall ball = balls[i];
            float speedModifier = MathUtils.map(0, BALLS - 1, 1f, 0.75f, i);
            if (ball.forward) {
                ball.angle += delta * 180f * speedModifier;
                if (ball.angle > 180f) {
                    ball.angle = 180f - (ball.angle - 180f);
                    ball.forward = false;
                    assets.getBallBeep().play(VOLUME, ball.pitch, 0f);
                }
            } else {
                ball.angle -= delta * 180f * speedModifier;
                if (ball.angle < 0f) {
                    ball.angle = -ball.angle;
                    ball.forward = true;
                    assets.getBallBeep().play(VOLUME, ball.pitch, 0f);
                }
            }
            float x = MathUtils.map(0f, 180f, ball.startingX, ball.finalX, ball.angle);
            float y = MathUtils.sinDeg(ball.angle) * (200f - i * 6f);
            y += ball.startingY;
            balls[i].setOriginBasedPosition(x, y);
        }
    }

    @Override
    public void exitModule() {
        super.exitModule();
        assets.getPads().stop();
    }
}
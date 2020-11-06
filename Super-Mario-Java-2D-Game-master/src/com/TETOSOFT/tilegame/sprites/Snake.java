package com.TETOSOFT.tilegame.sprites;

import com.TETOSOFT.graphics.Animation;

/**
    A Grub is a Creature that moves slowly on the ground.
*/
public class Snake extends Creature {

    public Snake(Animation left, Animation right,
        Animation deadLeft, Animation deadRight)
    {
        super(left, right, deadLeft, deadRight);
    }


    public float getMaxSpeed() {
        return 0.05f;
    }

}

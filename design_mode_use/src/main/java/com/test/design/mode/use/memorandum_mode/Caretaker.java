package com.test.design.mode.use.memorandum_mode;

/**
 * 管理者角色
 */
public class Caretaker {

    private Memorandum memorandum;

    public Memorandum getMemorandum() {
        return memorandum;
    }

    public void setMemorandum(Memorandum memorandum) {
        this.memorandum = memorandum;
    }
}
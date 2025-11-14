package c;

import android.window.BackEvent;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0547a f9306a = new Object();

    public final BackEvent a(float f8, float f9, float f10, int i4) {
        return new BackEvent(f8, f9, f10, i4);
    }

    public final float b(BackEvent backEvent) {
        o6.j.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        o6.j.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        o6.j.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        o6.j.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}

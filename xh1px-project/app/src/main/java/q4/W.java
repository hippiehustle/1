package q4;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class W extends GestureDetector.SimpleOnGestureListener {
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        o6.j.e(motionEvent, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o6.j.e(motionEvent, "e");
        return true;
    }
}

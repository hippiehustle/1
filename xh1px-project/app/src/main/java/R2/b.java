package R2;

import android.graphics.PointF;
import android.view.ScaleGestureDetector;
import o6.j;

/* loaded from: classes.dex */
public final class b extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f5004a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f5005b;

    public b(c cVar) {
        this.f5005b = cVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        j.e(scaleGestureDetector, "scaleGestureDetector");
        float focusX = scaleGestureDetector.getFocusX();
        PointF pointF = this.f5004a;
        pointF.x = focusX;
        pointF.y = scaleGestureDetector.getFocusY();
        c cVar = this.f5005b;
        cVar.e(scaleGestureDetector.getScaleFactor() * cVar.f5010h, pointF);
        return true;
    }
}

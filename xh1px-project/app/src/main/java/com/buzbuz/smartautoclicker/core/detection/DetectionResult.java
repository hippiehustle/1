package com.buzbuz.smartautoclicker.core.detection;

import Z.g;
import android.graphics.Point;
import g.InterfaceC0730a;
import kotlin.Metadata;
import o6.j;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/buzbuz/smartautoclicker/core/detection/DetectionResult;", "", "", "isDetected", "", "centerX", "centerY", "", "confidenceRate", "LZ5/y;", "setResults", "(ZIID)V", "detection_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DetectionResult {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9772a;

    /* renamed from: b, reason: collision with root package name */
    public final Point f9773b;

    /* renamed from: c, reason: collision with root package name */
    public double f9774c;

    public DetectionResult(boolean z8, Point point, double d2) {
        this.f9772a = z8;
        this.f9773b = point;
        this.f9774c = d2;
    }

    public static DetectionResult a(DetectionResult detectionResult) {
        boolean z8 = detectionResult.f9772a;
        Point point = detectionResult.f9773b;
        double d2 = detectionResult.f9774c;
        detectionResult.getClass();
        return new DetectionResult(z8, point, d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetectionResult)) {
            return false;
        }
        DetectionResult detectionResult = (DetectionResult) obj;
        return this.f9772a == detectionResult.f9772a && j.a(this.f9773b, detectionResult.f9773b) && Double.compare(this.f9774c, detectionResult.f9774c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f9774c) + ((this.f9773b.hashCode() + (Boolean.hashCode(this.f9772a) * 31)) * 31);
    }

    @InterfaceC0730a
    public final void setResults(boolean isDetected, int centerX, int centerY, double confidenceRate) {
        this.f9772a = isDetected;
        this.f9773b.set(centerX, centerY);
        this.f9774c = confidenceRate;
    }

    public final String toString() {
        return "DetectionResult(isDetected=" + this.f9772a + ", position=" + this.f9773b + ", confidenceRate=" + this.f9774c + ")";
    }
}

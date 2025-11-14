package com.buzbuz.smartautoclicker.core.detection;

import Z.g;
import Z5.j;
import a6.x;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import g.InterfaceC0730a;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000J\u0010\u0010\u0002\u001a\u00020\u0001H\u0082 ¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u000b\u0010\fJX\u0010\u0018\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082 ¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/buzbuz/smartautoclicker/core/detection/NativeDetector;", "", "newDetector", "()J", "LZ5/y;", "deleteDetector", "()V", "Landroid/graphics/Bitmap;", "screenBitmap", "", "metricsTag", "setScreenImage", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "conditionBitmap", "", "conditionWidth", "conditionHeight", "x", "y", "width", "height", "threshold", "Lcom/buzbuz/smartautoclicker/core/detection/DetectionResult;", "result", "detect", "(Landroid/graphics/Bitmap;IIIIIIILcom/buzbuz/smartautoclicker/core/detection/DetectionResult;)V", "releaseScreenImage", "(Landroid/graphics/Bitmap;)V", "detectionResult", "Lcom/buzbuz/smartautoclicker/core/detection/DetectionResult;", "nativePtr", "J", "detection_fDroidRelease"}, k = 1, mv = {g.FLOAT_FIELD_NUMBER, g.FLOAT_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NativeDetector implements AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f9775d;

    @InterfaceC0730a
    private final DetectionResult detectionResult = new DetectionResult(false, new Point(), 0.0d);

    @InterfaceC0730a
    private long nativePtr = -1;

    /* renamed from: e, reason: collision with root package name */
    public final Point f9776e = new Point(0, 0);

    private final native void deleteDetector();

    private final native void detect(Bitmap conditionBitmap, int conditionWidth, int conditionHeight, int x8, int y4, int width, int height, int threshold, DetectionResult result);

    private final native long newDetector();

    private final native void releaseScreenImage(Bitmap screenBitmap);

    private final native void setScreenImage(Bitmap screenBitmap, String metricsTag);

    public final DetectionResult a(Bitmap bitmap, int i4, int i8, Rect rect, int i9) {
        if (this.f9775d) {
            return DetectionResult.a(this.detectionResult);
        }
        try {
            detect(bitmap, i4, i8, rect.left, rect.top, rect.width(), rect.height(), i9, this.detectionResult);
            return DetectionResult.a(this.detectionResult);
        } catch (Exception e9) {
            Point point = this.f9776e;
            for (Map.Entry entry : x.P0(new j("screenSize", point.x + "x" + point.y), new j("originalConditionSize", bitmap.getWidth() + "x" + bitmap.getHeight()), new j("conditionSize", i4 + "x" + i8), new j("detectionArea", rect.toString()), new j("threshold", String.valueOf(i9))).entrySet()) {
                Log.e("Exception", "Crash key " + ((String) entry.getKey()) + " = " + ((String) entry.getValue()));
            }
            throw e9;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f9775d) {
            return;
        }
        this.f9775d = true;
        deleteDetector();
    }

    public final void d() {
        this.nativePtr = newDetector();
    }

    public final void e(Bitmap bitmap) {
        o6.j.e(bitmap, "screenBitmap");
        if (this.f9775d) {
            return;
        }
        releaseScreenImage(bitmap);
    }

    public final void j(Bitmap bitmap, String str) {
        o6.j.e(bitmap, "screenBitmap");
        o6.j.e(str, "metadata");
        if (this.f9775d) {
            return;
        }
        int width = bitmap.getWidth();
        Point point = this.f9776e;
        point.x = width;
        point.y = bitmap.getHeight();
        setScreenImage(bitmap, str);
    }
}

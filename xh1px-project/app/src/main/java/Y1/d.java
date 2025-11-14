package Y1;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import b6.C0538f;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import o6.j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final WindowManager f7100a;

    /* renamed from: b, reason: collision with root package name */
    public final Display f7101b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f7102c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public final c f7103d = new c(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"), 0);

    /* renamed from: e, reason: collision with root package name */
    public b f7104e = b();

    public d(Context context) {
        this.f7100a = (WindowManager) context.getSystemService(WindowManager.class);
        this.f7101b = ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
    }

    public static b a(b bVar, b bVar2) {
        int i4 = bVar.f7095b;
        int i8 = bVar2.f7095b;
        Point point = bVar2.f7094a;
        if (i4 != i8 && bVar.f7094a.equals(point)) {
            point = new Point(point.y, point.x);
        }
        return new b(point, i8, bVar2.f7096c, bVar2.f7097d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        r1 = r1.getCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b b() {
        DisplayCutout cutout;
        Point d2 = d();
        Display display = this.f7101b;
        int rotation = display.getRotation();
        int i4 = 0;
        int i8 = 1;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        i8 = 0;
                    }
                }
            }
            i8 = 2;
        }
        if (Build.VERSION.SDK_INT >= 29 && cutout != null) {
            i4 = cutout.getSafeInsetTop();
        }
        C0538f c0538f = new C0538f();
        a aVar = a.f7089d;
        c0538f.put(aVar, c(aVar));
        a aVar2 = a.f7090e;
        c0538f.put(aVar2, c(aVar2));
        a aVar3 = a.f7091f;
        c0538f.put(aVar3, c(aVar3));
        a aVar4 = a.f7092g;
        c0538f.put(aVar4, c(aVar4));
        return new b(d2, i8, i4, c0538f.c());
    }

    public final e c(a aVar) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int i4;
        RoundedCorner roundedCorner;
        Point center;
        int radius;
        if (Build.VERSION.SDK_INT >= 31) {
            currentWindowMetrics = this.f7100a.getCurrentWindowMetrics();
            windowInsets = currentWindowMetrics.getWindowInsets();
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                i4 = 1;
                if (ordinal != 1) {
                    i4 = 3;
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            i4 = 2;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            } else {
                i4 = 0;
            }
            roundedCorner = windowInsets.getRoundedCorner(i4);
            if (roundedCorner != null) {
                center = roundedCorner.getCenter();
                j.d(center, "getCenter(...)");
                radius = roundedCorner.getRadius();
                return new e(center, radius);
            }
            return null;
        }
        return null;
    }

    public final Point d() {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = this.f7100a.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return new Point(bounds.width(), bounds.height());
        }
        Point point = new Point();
        this.f7101b.getRealSize(point);
        return point;
    }
}

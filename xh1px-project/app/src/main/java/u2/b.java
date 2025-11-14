package u2;

import Y1.d;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import j2.C0902b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o6.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f15313a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f15314b;

    /* renamed from: c, reason: collision with root package name */
    public double f15315c;

    /* renamed from: d, reason: collision with root package name */
    public double f15316d;

    public b(d dVar) {
        j.e(dVar, "displayConfigManager");
        this.f15313a = dVar;
        this.f15314b = new LinkedHashMap();
        this.f15315c = 10000.0d;
        this.f15316d = 1.0d;
    }

    public final void a(Point point, List list) {
        LinkedHashMap linkedHashMap = this.f15314b;
        linkedHashMap.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0902b c0902b = (C0902b) it.next();
            Rect c6 = c(c0902b.f11794f);
            Long valueOf = Long.valueOf(c0902b.f11789a.f12187a);
            Rect rect = new Rect(0, 0, point.x, point.y);
            int i4 = c0902b.f11796h;
            if (i4 != 1) {
                if (i4 == 2) {
                    continue;
                } else if (i4 == 3) {
                    Rect rect2 = c0902b.j;
                    if (rect2 != null) {
                        rect = h2.a.q(c(rect2), rect);
                    } else {
                        throw new IllegalArgumentException("Invalid IN_AREA condition, no area defined");
                    }
                } else {
                    throw new IllegalArgumentException("Unexpected detection type");
                }
            } else {
                rect = h2.a.q(c6, rect);
            }
            linkedHashMap.put(valueOf, new C1630a(c0902b, c6, rect));
        }
        Log.i("ScalingManager", "Scaling data refresh for " + list.size() + " conditions");
    }

    public final Point b() {
        double d2;
        Point point = this.f15313a.f7104e.f7094a;
        double max = Math.max(point.x, point.y);
        double d3 = this.f15315c;
        if (max <= d3) {
            d2 = 1.0d;
        } else {
            d2 = d3 / max;
        }
        this.f15316d = d2;
        Point z8 = h2.a.z(point, d2);
        Log.i("ScalingManager", "Scaling metrics refreshed: ratio=" + this.f15316d + ", screenSize=" + point + ", scaledScreenSize=" + z8);
        return z8;
    }

    public final Rect c(Rect rect) {
        double d2 = this.f15316d;
        j.e(rect, "<this>");
        if (d2 == 1.0d) {
            return rect;
        }
        int w8 = h2.a.w(rect.left * d2);
        int w9 = h2.a.w(rect.top * d2);
        return new Rect(w8, w9, h2.a.w(rect.width() * d2) + w8, h2.a.w(rect.height() * d2) + w9);
    }
}

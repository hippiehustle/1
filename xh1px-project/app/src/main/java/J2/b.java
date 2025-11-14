package J2;

import O7.i0;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.LinkedHashMap;
import o6.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Y1.d f2385a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2386b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f2387c;

    public b(Y1.d dVar) {
        j.e(dVar, "displayConfigManager");
        this.f2385a = dVar;
        this.f2386b = new LinkedHashMap();
        this.f2387c = new LinkedHashMap();
    }

    public final void a(a aVar, View view) {
        j.e(aVar, "type");
        j.e(view, "monitoredView");
        LinkedHashMap linkedHashMap = this.f2386b;
        if (!linkedHashMap.containsKey(aVar)) {
            linkedHashMap.put(aVar, new d(this.f2385a));
        }
        d dVar = (d) linkedHashMap.get(aVar);
        if (dVar != null) {
            dVar.f2391c = view;
            dVar.f2392d = e.f2395d;
            dVar.a();
            view.getViewTreeObserver().addOnGlobalLayoutListener(dVar.f2390b);
        }
    }

    public final void b(a aVar) {
        ViewTreeObserver viewTreeObserver;
        j.e(aVar, "type");
        d dVar = (d) this.f2386b.get(aVar);
        if (dVar != null) {
            View view = dVar.f2391c;
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(dVar.f2390b);
            }
            dVar.f2391c = null;
            i0 i0Var = dVar.f2393e;
            Rect rect = new Rect();
            i0Var.getClass();
            i0Var.h(null, rect);
        }
    }
}

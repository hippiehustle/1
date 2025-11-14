package T2;

import S2.e;
import S2.f;
import S2.g;
import S2.h;
import S2.j;
import a6.AbstractC0434i;
import a6.x;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import b6.C0538f;
import b6.C0539g;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: d, reason: collision with root package name */
    public final int f5664d;

    /* renamed from: e, reason: collision with root package name */
    public final C0538f f5665e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f5666f;

    /* renamed from: g, reason: collision with root package name */
    public Set f5667g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f5668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, c cVar, S2.a aVar) {
        super(cVar, aVar);
        int i4;
        int i8;
        int i9 = cVar.f5673l;
        int i10 = cVar.k;
        int i11 = cVar.j;
        int i12 = cVar.f5672i;
        int i13 = cVar.f5669f;
        int i14 = cVar.f5670g;
        Integer num = cVar.f5675n;
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = 0;
        }
        this.f5664d = i4;
        Rect rect = new Rect();
        this.f5666f = rect;
        RectF rectF = this.f5325c;
        Rect rect2 = new Rect();
        rectF.roundOut(rect2);
        rect.set(rect2);
        C0538f c0538f = new C0538f();
        c0538f.put(S2.c.f5318a, new d(context, i14, rect, cVar.f5671h, new boolean[]{true}));
        Integer num2 = cVar.f5674m;
        if (num2 != null) {
            d dVar = new d(context, i14, rect, num2.intValue(), new boolean[]{false});
            i8 = i14;
            c0538f.put(j.f5326a, dVar);
        } else {
            i8 = i14;
        }
        c0538f.put(S2.d.f5319a, new a(context, i8, rect, i13, new int[]{i12, i11}, new boolean[]{true, false}, true));
        c0538f.put(g.f5322a, new a(context, i8, rect, i13, new int[]{i12, i11}, new boolean[]{false, true}, true));
        c0538f.put(f.f5321a, new a(context, i8, rect, i13, new int[]{i10, i9}, new boolean[]{true, false}, false));
        c0538f.put(e.f5320a, new a(context, i8, rect, i13, new int[]{i10, i9}, new boolean[]{false, true}, false));
        this.f5665e = c0538f.c();
        this.f5667g = new HashSet();
        this.f5668h = new Rect();
    }

    @Override // S2.h
    public final void b(Canvas canvas) {
        Iterator it = this.f5667g.iterator();
        while (it.hasNext()) {
            Object obj = this.f5665e.get((S2.b) it.next());
            o6.j.b(obj);
            ((d) obj).a(canvas);
        }
    }

    @Override // S2.h
    public final void c() {
        Rect rect = new Rect();
        this.f5325c.roundOut(rect);
        this.f5666f.set(rect);
    }

    public final void e(int i4) {
        Iterator it = ((C0539g) this.f5665e.entrySet()).iterator();
        while (it.hasNext()) {
            ((d) ((Map.Entry) it.next()).getValue()).c(i4);
        }
        a();
    }

    public final void f(Rect rect) {
        boolean z8;
        o6.j.e(rect, "newSelectorArea");
        this.f5668h.set(rect);
        int size = this.f5667g.size();
        C0538f c0538f = this.f5665e;
        if (size == c0538f.f9232l) {
            z8 = true;
        } else {
            z8 = false;
        }
        Iterator it = ((C0539g) c0538f.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            S2.b bVar = (S2.b) entry.getKey();
            d dVar = (d) entry.getValue();
            if (o6.j.a(bVar, S2.c.f5318a)) {
                dVar.b(rect, rect.centerX(), rect.centerY(), new boolean[]{false});
            } else if (o6.j.a(bVar, j.f5326a)) {
                dVar.b(rect, rect.centerX(), rect.top - this.f5664d, new boolean[]{false});
            } else if (o6.j.a(bVar, g.f5322a)) {
                dVar.b(rect, rect.centerX(), rect.top, new boolean[]{false, z8});
            } else if (o6.j.a(bVar, S2.d.f5319a)) {
                dVar.b(rect, rect.centerX(), rect.bottom, new boolean[]{z8, false});
            } else if (o6.j.a(bVar, e.f5320a)) {
                dVar.b(rect, rect.left, rect.centerY(), new boolean[]{false, z8});
            } else if (o6.j.a(bVar, f.f5321a)) {
                dVar.b(rect, rect.right, rect.centerY(), new boolean[]{z8, false});
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        a();
    }

    public final void g(S2.b bVar) {
        o6.j.e(bVar, "gesture");
        LinkedHashSet linkedHashSet = new LinkedHashSet(x.N0(1));
        AbstractC0434i.e1(new S2.b[]{bVar}, linkedHashSet);
        this.f5667g = linkedHashSet;
        e(255);
        f(this.f5668h);
    }
}

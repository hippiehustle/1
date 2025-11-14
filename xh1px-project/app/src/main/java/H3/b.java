package H3;

import O7.i0;
import a6.AbstractC0438m;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import b6.C0533a;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.card.MaterialCardView;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import g2.C0777a;
import i2.C0880a;
import j2.C0902b;
import j2.C0903c;
import j2.C0905e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import k2.AbstractC0951a;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import l1.C1000b;
import l2.C1001a;

/* loaded from: classes.dex */
public final class b implements M0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1901d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1902e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1903f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1904g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1905h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1906i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f1907l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1908m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f1909n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1910o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f1911p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f1912q;

    public /* synthetic */ b(FrameLayout frameLayout, View view, View view2, View view3, View view4, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i4) {
        this.f1901d = i4;
        this.f1902e = frameLayout;
        this.f1903f = view;
        this.f1904g = view2;
        this.f1905h = view3;
        this.f1906i = view4;
        this.j = obj;
        this.k = obj2;
        this.f1907l = obj3;
        this.f1908m = obj4;
        this.f1909n = obj5;
        this.f1910o = obj6;
        this.f1911p = obj7;
        this.f1912q = obj8;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f2.a a(f2.a aVar, C0999a c0999a) {
        C0880a c0880a;
        Object obj;
        ComponentName componentName;
        C0999a c0999a2;
        C1000b c1000b = (C1000b) this.k;
        o6.j.e(aVar, "from");
        ArrayList arrayList = null;
        r3 = null;
        C0999a c0999a3 = null;
        if (aVar instanceof f2.e) {
            f2.e eVar = (f2.e) aVar;
            if (eVar.f10695f == f2.d.f10688e && (c0999a2 = eVar.f10697h) != null) {
                c0999a3 = (C0999a) ((LinkedHashMap) this.f1910o).get(c0999a2);
            }
            return f2.e.i(eVar, c1000b.a(), c0999a, A.j.k(eVar.f10692c), 0, null, null, null, c0999a3, null, 376);
        }
        if (aVar instanceof f2.k) {
            f2.k kVar = (f2.k) aVar;
            return f2.k.i(kVar, c1000b.a(), c0999a, A.j.k(kVar.f10732c), 0, null, null, null, 120);
        }
        if (aVar instanceof f2.i) {
            f2.i iVar = (f2.i) aVar;
            return f2.i.i(iVar, c1000b.a(), c0999a, A.j.k(iVar.f10721c), 0, null, 24);
        }
        if (aVar instanceof f2.f) {
            f2.f fVar = (f2.f) aVar;
            C0999a a3 = c1000b.a();
            String k = A.j.k(fVar.f10701c);
            String k6 = A.j.k(fVar.f10705g);
            ComponentName componentName2 = fVar.f10706h;
            if (componentName2 != null) {
                componentName = componentName2.clone();
            } else {
                componentName = null;
            }
            List<C0777a> list = fVar.j;
            if (list != null) {
                arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                for (C0777a c0777a : list) {
                    arrayList.add(C0777a.e(c0777a, ((C1000b) this.f1907l).a(), c0999a, c0777a.f11135c, 8));
                }
            }
            return f2.f.i(fVar, a3, c0999a, k, 0, null, false, k6, componentName, null, arrayList, 312);
        }
        if (aVar instanceof f2.o) {
            f2.o oVar = (f2.o) aVar;
            C0999a a4 = c1000b.a();
            List<C0880a> list2 = oVar.f10756g;
            ArrayList arrayList2 = new ArrayList();
            for (C0880a c0880a2 : list2) {
                if (!o6.j.a(c0880a2.f11755c, c0999a)) {
                    ListIterator listIterator = ((C3.e) this.f1904g).a().listIterator(0);
                    while (true) {
                        C0533a c0533a = (C0533a) listIterator;
                        if (c0533a.hasNext()) {
                            obj = c0533a.next();
                            if (c0999a.equals(((AbstractC0951a) obj).getId())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    if (obj == null) {
                        c0880a = null;
                        if (c0880a == null) {
                            arrayList2.add(c0880a);
                        }
                    }
                }
                C0999a a9 = ((C1000b) this.f1908m).a();
                C0999a c0999a4 = c0880a2.f11755c;
                f2.n nVar = c0880a2.f11756d;
                o6.j.e(nVar, "toggleType");
                c0880a = new C0880a(a9, a4, c0999a4, nVar);
                if (c0880a == null) {
                }
            }
            return f2.o.i(oVar, a4, c0999a, A.j.k(oVar.f10752c), 0, false, null, arrayList2, 56);
        }
        if (aVar instanceof f2.c) {
            f2.c cVar = (f2.c) aVar;
            return f2.c.i(cVar, c1000b.a(), c0999a, A.j.k(cVar.f10682c), 0, A.j.k(cVar.f10684e), null, null, 104);
        }
        if (aVar instanceof f2.h) {
            f2.h hVar = (f2.h) aVar;
            return f2.h.i(hVar, c1000b.a(), c0999a, A.j.k(hVar.f10713c), 0, null, A.j.k(hVar.f10716f), A.j.k(hVar.f10717g), 0, 152);
        }
        if (aVar instanceof f2.m) {
            f2.m mVar = (f2.m) aVar;
            return f2.m.i(mVar, c1000b.a(), c0999a, A.j.k(mVar.f10743c), 0, mVar.f10745e, 8);
        }
        if (aVar instanceof f2.j) {
            f2.j jVar = (f2.j) aVar;
            return f2.j.i(jVar, c1000b.a(), c0999a, A.j.k(jVar.f10726c), 0, jVar.f10728e, jVar.f10729f, 8);
        }
        throw new NoWhenBranchMatchedException();
    }

    public f2.e b(Context context) {
        long j;
        C0999a a3 = ((C1000b) this.k).a();
        C0999a h8 = h();
        W0.d dVar = (W0.d) this.f1905h;
        dVar.getClass();
        String string = context.getString(R.string.default_click_name);
        o6.j.d(string, "getString(...)");
        if (((b2.r) dVar.f6489e).h()) {
            j = 1;
        } else {
            j = h2.a.j(context).getLong("Last_Click_Press_Duration", context.getResources().getInteger(R.integer.default_click_press_duration));
        }
        return new f2.e(a3, h8, string, 0, Long.valueOf(j), f2.d.f10687d, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(Context context, Rect rect, Bitmap bitmap, AbstractC0713c abstractC0713c) {
        a aVar;
        int i4;
        String str;
        Rect rect2;
        C0999a c0999a;
        int integer;
        W0.d dVar = (W0.d) this.f1905h;
        if (abstractC0713c instanceof a) {
            aVar = (a) abstractC0713c;
            int i8 = aVar.f1900l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f1900l = i8 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                i4 = aVar.f1900l;
                if (i4 == 0) {
                    if (i4 == 1) {
                        C0999a c0999a2 = aVar.f1899i;
                        Rect rect3 = aVar.f1898h;
                        Context context2 = aVar.f1897g;
                        Z5.a.d(obj);
                        rect2 = rect3;
                        c0999a = c0999a2;
                        context = context2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    C0999a a3 = ((C1000b) this.j).a();
                    q1.e eVar = (q1.e) this.f1903f;
                    if (((b2.r) this.f1902e).h()) {
                        str = "Tutorial_Condition_";
                    } else {
                        str = "Condition_";
                    }
                    aVar.f1897g = context;
                    aVar.f1898h = rect;
                    aVar.f1899i = a3;
                    aVar.f1900l = 1;
                    Object c6 = eVar.c(bitmap, str, aVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (c6 == enumC0646a) {
                        return enumC0646a;
                    }
                    rect2 = rect;
                    c0999a = a3;
                    obj = c6;
                }
                String str2 = (String) obj;
                ((ArrayList) this.f1911p).add(str2);
                C0999a h8 = h();
                dVar.getClass();
                String e9 = W0.d.e(context);
                if (!((b2.r) dVar.f6489e).h()) {
                    integer = 15;
                } else {
                    integer = context.getResources().getInteger(R.integer.default_condition_threshold);
                }
                return new C0902b(c0999a, h8, e9, 0, str2, rect2, integer, 1, true, null);
            }
        }
        aVar = new a(this, abstractC0713c);
        Object obj2 = aVar.j;
        i4 = aVar.f1900l;
        if (i4 == 0) {
        }
        String str22 = (String) obj2;
        ((ArrayList) this.f1911p).add(str22);
        C0999a h82 = h();
        dVar.getClass();
        String e92 = W0.d.e(context);
        if (!((b2.r) dVar.f6489e).h()) {
        }
        return new C0902b(c0999a, h82, e92, 0, str22, rect2, integer, 1, true, null);
    }

    public C0902b d(C0902b c0902b, C0999a c0999a) {
        o6.j.e(c0902b, "condition");
        return C0902b.i(c0902b, ((C1000b) this.j).a(), c0999a, A.j.k(c0902b.f11791c), 0, A.j.k(c0902b.f11793e), 0, 0, false, null, 1000);
    }

    public f2.k e(Context context) {
        C0999a a3 = ((C1000b) this.k).a();
        C0999a h8 = h();
        ((W0.d) this.f1905h).getClass();
        String string = context.getString(R.string.default_swipe_name);
        o6.j.d(string, "getString(...)");
        return new f2.k(a3, h8, string, 0, Long.valueOf(h2.a.j(context).getLong("Last_Swipe_Duration", context.getResources().getInteger(R.integer.default_swipe_duration))), null, null);
    }

    public j2.g f(j2.g gVar, C0999a c0999a) {
        C1000b c1000b = (C1000b) this.j;
        o6.j.e(gVar, "condition");
        if (gVar instanceof C0903c) {
            C0903c c0903c = (C0903c) gVar;
            C0999a a3 = c1000b.a();
            String k = A.j.k(c0903c.f11800c);
            String str = c0903c.f11801d;
            o6.j.e(k, "name");
            o6.j.e(str, "intentAction");
            return new C0903c(a3, c0999a, k, str);
        }
        if (gVar instanceof C0905e) {
            C0905e c0905e = (C0905e) gVar;
            return C0905e.i(c0905e, c1000b.a(), c0999a, A.j.k(c0905e.f11810c), A.j.k(c0905e.f11811d), null, null, 48);
        }
        if (gVar instanceof j2.f) {
            j2.f fVar = (j2.f) gVar;
            return j2.f.i(fVar, c1000b.a(), c0999a, A.j.k(fVar.f11816c), 0L, false, 24);
        }
        throw new NoWhenBranchMatchedException();
    }

    public C0999a g() {
        C3.a aVar;
        i0 i0Var;
        f2.a aVar2;
        C0999a id;
        E3.a aVar3 = (E3.a) ((C3.e) this.f1904g).f601h.f();
        if (aVar3 != null && (aVar = aVar3.f1193m) != null && (i0Var = aVar.f894h) != null && (aVar2 = (f2.a) i0Var.f()) != null && (id = aVar2.getId()) != null) {
            return id;
        }
        throw new IllegalStateException("Can't create items without an edited action");
    }

    @Override // M0.a
    public View getRoot() {
        switch (this.f1901d) {
            case 1:
                return (NestedScrollView) this.f1902e;
            default:
                return (MaterialCardView) this.f1902e;
        }
    }

    public C0999a h() {
        i0 i0Var;
        AbstractC0951a abstractC0951a;
        C0999a id;
        E3.a aVar = (E3.a) ((C3.e) this.f1904g).f601h.f();
        if (aVar != null && (i0Var = aVar.f894h) != null && (abstractC0951a = (AbstractC0951a) i0Var.f()) != null && (id = abstractC0951a.getId()) != null) {
            return id;
        }
        throw new IllegalStateException("Can't create items without an edited event");
    }

    public C0999a i() {
        C0999a c0999a;
        C1001a c1001a = (C1001a) ((C3.e) this.f1904g).f597d.f();
        if (c1001a != null && (c0999a = c1001a.f12190a) != null) {
            return c0999a;
        }
        throw new IllegalStateException("Can't create items without an edited scenario");
    }

    public void j() {
        ((C1000b) this.f1906i).f12189a = 0L;
        ((C1000b) this.j).f12189a = 0L;
        ((C1000b) this.k).f12189a = 0L;
        ((C1000b) this.f1907l).f12189a = 0L;
        ((C1000b) this.f1909n).f12189a = 0L;
        ((LinkedHashMap) this.f1910o).clear();
        ((ArrayList) this.f1911p).clear();
    }

    public b(b2.r rVar, q1.e eVar, C3.e eVar2) {
        this.f1901d = 0;
        o6.j.e(rVar, "repository");
        o6.j.e(eVar, "bitmapRepository");
        this.f1902e = rVar;
        this.f1903f = eVar;
        this.f1904g = eVar2;
        this.f1905h = new W0.d(rVar);
        this.f1906i = new Object();
        this.j = new Object();
        this.k = new Object();
        this.f1907l = new Object();
        this.f1908m = new Object();
        this.f1909n = new Object();
        this.f1910o = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        this.f1911p = arrayList;
        this.f1912q = arrayList;
    }
}

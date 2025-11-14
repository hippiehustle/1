package M3;

import D4.C0040p;
import O7.C0232e;
import O7.InterfaceC0233f;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import j2.C0902b;
import java.util.Collection;
import java.util.Iterator;
import k2.C0952b;
import l0.C0997a;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class Z extends androidx.lifecycle.Z {

    /* renamed from: b, reason: collision with root package name */
    public final q1.e f3415b;

    /* renamed from: c, reason: collision with root package name */
    public final H3.n f3416c;

    /* renamed from: d, reason: collision with root package name */
    public final J2.b f3417d;

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f3418e;

    /* renamed from: f, reason: collision with root package name */
    public final O7.P f3419f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0233f f3420g;

    /* renamed from: h, reason: collision with root package name */
    public final C4.e f3421h;

    /* renamed from: i, reason: collision with root package name */
    public final Q f3422i;
    public final C4.e j;
    public final Q k;

    /* renamed from: l, reason: collision with root package name */
    public final O7.P f3423l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0233f f3424m;

    /* renamed from: n, reason: collision with root package name */
    public final C4.e f3425n;

    public Z(Context context, q1.e eVar, H3.n nVar, J2.b bVar) {
        o6.j.e(eVar, "bitmapRepository");
        o6.j.e(nVar, "editionRepository");
        o6.j.e(bVar, "monitoredViewsManager");
        this.f3415b = eVar;
        this.f3416c = nVar;
        this.f3417d = bVar;
        this.f3418e = h2.a.j(context);
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1990m;
        W0.d dVar = new W0.d(15, new C0040p(nVar2, 12));
        C0040p c0040p = new C0040p(nVar2, 11);
        C0997a g8 = androidx.lifecycle.U.g(this);
        Boolean bool = Boolean.FALSE;
        C0232e c0232e = O7.Z.f4117a;
        this.f3419f = O7.V.t(c0040p, g8, c0232e, bool);
        this.f3420g = O7.V.j(O7.V.k(nVar.j));
        this.f3421h = new C4.e(new O(dVar, 0), 12);
        this.f3422i = new Q(dVar, 0);
        this.j = new C4.e(new O(dVar, 1), 12);
        this.k = new Q(dVar, 1);
        this.f3423l = O7.V.t(new W(yVar.f1987h, context, 0), androidx.lifecycle.U.g(this), c0232e, a6.s.f7766d);
        this.f3424m = O7.V.k(O7.V.q(new A4.c(yVar.f1986g, dVar, new K(this, context, (InterfaceC0617c) null), 27), S7.d.f5456f));
        this.f3425n = new C4.e(yVar.f1990m, 9);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(Z z8, Context context, C0952b c0952b, f2.e eVar, AbstractC0713c abstractC0713c) {
        J j;
        int i4;
        Bitmap bitmap;
        Object obj;
        C0902b c0902b;
        Context context2;
        Object obj2;
        String string;
        f2.e eVar2 = eVar;
        if (abstractC0713c instanceof J) {
            j = (J) abstractC0713c;
            int i8 = j.f3373l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                j.f3373l = i8 - Integer.MIN_VALUE;
                Object obj3 = j.j;
                i4 = j.f3373l;
                if (i4 == 0) {
                    if (i4 == 1) {
                        C0902b c0902b2 = j.f3372i;
                        f2.e eVar3 = j.f3371h;
                        context2 = j.f3370g;
                        Z5.a.d(obj3);
                        c0902b = c0902b2;
                        eVar2 = eVar3;
                        obj2 = obj3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj3);
                    Iterator it = c0952b.f11964f.iterator();
                    while (true) {
                        bitmap = null;
                        if (it.hasNext()) {
                            obj = it.next();
                            if (o6.j.a(eVar2.f10697h, ((C0902b) obj).f11789a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    c0902b = (C0902b) obj;
                    if (c0902b != null) {
                        q1.e eVar4 = z8.f3415b;
                        j.f3370g = context;
                        j.f3371h = eVar2;
                        j.f3372i = c0902b;
                        j.f3373l = 1;
                        Bitmap w8 = AbstractC1638C.w(eVar4, c0902b);
                        EnumC0646a enumC0646a = EnumC0646a.f10656d;
                        if (w8 == enumC0646a) {
                            return enumC0646a;
                        }
                        obj2 = w8;
                        context2 = context;
                    } else {
                        context2 = context;
                        Bitmap bitmap2 = bitmap;
                        boolean z9 = !((Collection) z8.f3423l.f4088d.f()).isEmpty();
                        String string2 = context2.getString(R.string.field_condition_selection_title_and_operator);
                        o6.j.d(string2, "getString(...)");
                        if (c0902b == null && bitmap2 != null) {
                            string = context2.getString(R.string.field_condition_selection_desc_and_operator, c0902b.f11791c);
                        } else {
                            string = context2.getString(R.string.field_condition_selection_desc_and_operator_not_found);
                        }
                        return new I(f2.d.f10688e, true, true, true, g(context2, eVar2), z9, string2, string, bitmap2);
                    }
                }
                bitmap = (Bitmap) obj2;
                Bitmap bitmap22 = bitmap;
                boolean z92 = !((Collection) z8.f3423l.f4088d.f()).isEmpty();
                String string22 = context2.getString(R.string.field_condition_selection_title_and_operator);
                o6.j.d(string22, "getString(...)");
                if (c0902b == null) {
                }
                string = context2.getString(R.string.field_condition_selection_desc_and_operator_not_found);
                return new I(f2.d.f10688e, true, true, true, g(context2, eVar2), z92, string22, string, bitmap22);
            }
        }
        j = new J(z8, abstractC0713c);
        Object obj32 = j.j;
        i4 = j.f3373l;
        if (i4 == 0) {
        }
        bitmap = (Bitmap) obj2;
        Bitmap bitmap222 = bitmap;
        boolean z922 = !((Collection) z8.f3423l.f4088d.f()).isEmpty();
        String string222 = context2.getString(R.string.field_condition_selection_title_and_operator);
        o6.j.d(string222, "getString(...)");
        if (c0902b == null) {
        }
        string = context2.getString(R.string.field_condition_selection_desc_and_operator_not_found);
        return new I(f2.d.f10688e, true, true, true, g(context2, eVar2), z922, string222, string, bitmap222);
    }

    public static final I f(Z z8, Context context, f2.e eVar, boolean z9) {
        int i4;
        String string;
        boolean z10 = !z9;
        String string2 = context.getString(R.string.field_click_position_title);
        o6.j.d(string2, "getString(...)");
        Point point = eVar.f10696g;
        if (point == null) {
            string = context.getString(R.string.generic_select_the_position);
        } else {
            Integer valueOf = Integer.valueOf(point.x);
            Point point2 = eVar.f10696g;
            if (point2 != null) {
                i4 = point2.y;
            } else {
                i4 = 0;
            }
            string = context.getString(R.string.field_click_position_desc, valueOf, Integer.valueOf(i4));
        }
        return new I(f2.d.f10687d, z10, z10, false, g(context, eVar), true, string2, string, null);
    }

    public static String g(Context context, f2.e eVar) {
        Point point;
        String string;
        if (eVar.f10695f == f2.d.f10688e) {
            point = eVar.f10698i;
        } else {
            point = null;
        }
        if (point != null && (string = context.getString(R.string.field_click_offset_desc, Integer.valueOf(point.x), Integer.valueOf(point.y))) != null) {
            return string;
        }
        String string2 = context.getString(R.string.field_click_offset_desc_none);
        o6.j.d(string2, "getString(...)");
        return string2;
    }
}

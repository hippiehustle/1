package A0;

import P.F;
import P.O;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d1.C0594a;
import e1.C0637a;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import k2.AbstractC0951a;
import k2.C0952b;
import k2.C0953c;
import k3.C0959f;
import kotlin.NoWhenBranchMatchedException;
import m1.InterfaceC1054d;
import n2.C1155c;
import r4.AbstractC1469i;
import t0.C1549o;
import t0.C1555v;
import x.C1770i;

/* loaded from: classes.dex */
public final class i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213a;

    public /* synthetic */ i(int i4) {
        this.f213a = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i4;
        boolean z8;
        boolean z9;
        int i8 = -1;
        switch (this.f213a) {
            case 0:
                return E2.c.N((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 1:
                return E2.c.N((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return E2.c.N(((j) obj).f214a, ((j) obj2).f214a);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return E2.c.N(((l) obj).f226a, ((l) obj2).f226a);
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                WeakHashMap weakHashMap = O.f4214a;
                float g8 = F.g((View) obj);
                float g9 = F.g((View) obj2);
                if (g8 > g9) {
                    return -1;
                }
                if (g8 < g9) {
                    return 1;
                }
                return 0;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return E2.c.N(((N3.e) obj).f3748a.f10607b, ((N3.e) obj2).f3748a.f10607b);
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return E2.c.N(((N3.e) obj).f3748a.f10607b, ((N3.e) obj2).f3748a.f10607b);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = ((C0594a) obj).f10365b;
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                o6.j.d(lowerCase, "toLowerCase(...)");
                String lowerCase2 = ((C0594a) obj2).f10365b.toLowerCase(locale);
                o6.j.d(lowerCase2, "toLowerCase(...)");
                return E2.c.N(lowerCase, lowerCase2);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                String str2 = ((C0594a) obj).f10365b;
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = str2.toLowerCase(locale2);
                o6.j.d(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = ((C0594a) obj2).f10365b.toLowerCase(locale2);
                o6.j.d(lowerCase4, "toLowerCase(...)");
                return E2.c.N(lowerCase3, lowerCase4);
            case 9:
                return E2.c.N(((C0637a) obj).f10595b, ((C0637a) obj2).f10595b);
            case 10:
                return E2.c.N(((Z4.i) obj).f7446a, ((Z4.i) obj2).f7446a);
            case 11:
                return E2.c.N(Long.valueOf(((Z4.i) obj).a()), Long.valueOf(((Z4.i) obj2).a()));
            case 12:
                return E2.c.N(Long.valueOf(((Z4.i) obj).c()), Long.valueOf(((Z4.i) obj2).c()));
            case 13:
                return E2.c.N(((Z4.i) obj2).f7446a, ((Z4.i) obj).f7446a);
            case 14:
                return E2.c.N(Long.valueOf(((Z4.i) obj2).a()), Long.valueOf(((Z4.i) obj).a()));
            case 15:
                return E2.c.N(Long.valueOf(((Z4.i) obj2).c()), Long.valueOf(((Z4.i) obj).c()));
            case 16:
                AbstractC0951a abstractC0951a = (AbstractC0951a) obj;
                if (abstractC0951a instanceof C0952b) {
                    i4 = ((C0952b) abstractC0951a).f11966h;
                } else if (abstractC0951a instanceof C0953c) {
                    i4 = -1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                Integer valueOf = Integer.valueOf(i4);
                AbstractC0951a abstractC0951a2 = (AbstractC0951a) obj2;
                if (abstractC0951a2 instanceof C0952b) {
                    i8 = ((C0952b) abstractC0951a2).f11966h;
                } else if (!(abstractC0951a2 instanceof C0953c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return E2.c.N(valueOf, Integer.valueOf(i8));
            case 17:
                return E2.c.N(((C0637a) obj).f10595b, ((C0637a) obj2).f10595b);
            case 18:
                return E2.c.N(((C0637a) obj).f10595b, ((C0637a) obj2).f10595b);
            case 19:
                return E2.c.N(((j4.i) obj).a().s(), ((j4.i) obj2).a().s());
            case 20:
                return E2.c.N(((j4.i) obj).a().s(), ((j4.i) obj2).a().s());
            case 21:
                return E2.c.N(((C0959f) obj).f11988a.f11999b, ((C0959f) obj2).f11988a.f11999b);
            case 22:
                return E2.c.N(((C0959f) obj).f11988a.f11999b, ((C0959f) obj2).f11988a.f11999b);
            case 23:
                return E2.c.N(Integer.valueOf(((InterfaceC1054d) obj).b()), Integer.valueOf(((InterfaceC1054d) obj2).b()));
            case 24:
                return E2.c.N(Integer.valueOf(((C1155c) obj).f12869c), Integer.valueOf(((C1155c) obj2).f12869c));
            case 25:
                return E2.c.N(((AbstractC1469i) obj).a(), ((AbstractC1469i) obj2).a());
            case 26:
                return E2.c.N(((AbstractC1469i) obj).a(), ((AbstractC1469i) obj2).a());
            case 27:
                return ((C1549o) obj).f14909a - ((C1549o) obj2).f14909a;
            case 28:
                C1555v c1555v = (C1555v) obj;
                C1555v c1555v2 = (C1555v) obj2;
                RecyclerView recyclerView = c1555v.f15006d;
                if (recyclerView == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (c1555v2.f15006d == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z8 != z9) {
                    if (recyclerView == null) {
                        return 1;
                    }
                } else {
                    boolean z10 = c1555v.f15003a;
                    if (z10 != c1555v2.f15003a) {
                        if (!z10) {
                            return 1;
                        }
                    } else {
                        int i9 = c1555v2.f15004b - c1555v.f15004b;
                        if (i9 == 0) {
                            int i10 = c1555v.f15005c - c1555v2.f15005c;
                            if (i10 == 0) {
                                return 0;
                            }
                            return i10;
                        }
                        return i9;
                    }
                }
                return -1;
            default:
                return ((C1770i) obj).f16061b - ((C1770i) obj2).f16061b;
        }
    }
}

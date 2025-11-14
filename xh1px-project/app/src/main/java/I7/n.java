package I7;

import k2.AbstractC0951a;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f2247e;

    public /* synthetic */ n(String str, int i4) {
        this.f2246d = i4;
        this.f2247e = str;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        D0.c L8;
        switch (this.f2246d) {
            case 0:
                String str = (String) obj;
                o6.j.e(str, "it");
                boolean j0 = m.j0(str);
                String str2 = this.f2247e;
                if (j0) {
                    if (str.length() < str2.length()) {
                        return str2;
                    }
                    return str;
                }
                return AbstractC1149a.g(str2, str);
            case 1:
                String str3 = this.f2247e;
                D0.a aVar = (D0.a) obj;
                o6.j.e(aVar, "_connection");
                L8 = aVar.L("SELECT COUNT(path) FROM condition_table WHERE path=? AND type='ON_IMAGE_DETECTED'");
                try {
                    L8.k(str3, 1);
                    int i4 = 0;
                    if (L8.H()) {
                        i4 = (int) L8.getLong(0);
                    }
                    L8.close();
                    return Integer.valueOf(i4);
                } finally {
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                String str4 = this.f2247e;
                D0.a aVar2 = (D0.a) obj;
                o6.j.e(aVar2, "_connection");
                L8 = aVar2.L("SELECT COUNT(path) FROM condition_table WHERE path=? AND type='ON_IMAGE_DETECTED'");
                try {
                    L8.k(str4, 1);
                    int i8 = 0;
                    if (L8.H()) {
                        i8 = (int) L8.getLong(0);
                    }
                    L8.close();
                    return Integer.valueOf(i8);
                } finally {
                }
            default:
                AbstractC0951a abstractC0951a = (AbstractC0951a) obj;
                o6.j.e(abstractC0951a, "oldValue");
                return AbstractC0951a.f(abstractC0951a, this.f2247e, 0, false, 123);
        }
    }
}

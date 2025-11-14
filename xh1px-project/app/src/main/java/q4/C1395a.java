package q4;

import f4.C0708a;
import t0.AbstractC1534b;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1395a extends AbstractC1534b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1395a f14090e = new C1395a(0);

    /* renamed from: f, reason: collision with root package name */
    public static final C1395a f14091f = new C1395a(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14092d;

    public /* synthetic */ C1395a(int i4) {
        this.f14092d = i4;
    }

    @Override // t0.AbstractC1534b
    public final boolean a(Object obj, Object obj2) {
        switch (this.f14092d) {
            case 0:
                return ((C1397c) obj).equals((C1397c) obj2);
            default:
                return ((C0708a) obj).equals((C0708a) obj2);
        }
    }

    @Override // t0.AbstractC1534b
    public final boolean b(Object obj, Object obj2) {
        switch (this.f14092d) {
            case 0:
                if (((C1397c) obj).f14095a == ((C1397c) obj2).f14095a) {
                    return true;
                }
                return false;
            default:
                return o6.j.a(((C0708a) obj).f10757f.f11789a, ((C0708a) obj2).f10757f.f11789a);
        }
    }
}

package F6;

import C6.C0016q;
import C6.InterfaceC0002c;
import i7.AbstractC0898m;
import i7.C0896k;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: F6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057q extends AbstractC0898m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1550c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f1551d;

    public /* synthetic */ C0057q(AbstractCollection abstractCollection, int i4) {
        this.f1550c = i4;
        this.f1551d = abstractCollection;
    }

    public static /* synthetic */ void a(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 1) {
            if (i4 != 2) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i4 != 1 && i4 != 2) {
            objArr[2] = "addFakeOverride";
        } else {
            objArr[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // i7.AbstractC0898m
    public final void b(InterfaceC0002c interfaceC0002c) {
        switch (this.f1550c) {
            case 0:
                if (interfaceC0002c != null) {
                    C0896k.r(interfaceC0002c, null);
                    ((LinkedHashSet) this.f1551d).add(interfaceC0002c);
                    return;
                } else {
                    a(0);
                    throw null;
                }
            default:
                o6.j.e(interfaceC0002c, "fakeOverride");
                C0896k.r(interfaceC0002c, null);
                ((ArrayList) this.f1551d).add(interfaceC0002c);
                return;
        }
    }

    @Override // i7.AbstractC0898m
    public final void d(InterfaceC0002c interfaceC0002c, InterfaceC0002c interfaceC0002c2) {
        switch (this.f1550c) {
            case 0:
                if (interfaceC0002c2 != null) {
                    return;
                }
                a(2);
                throw null;
            default:
                o6.j.e(interfaceC0002c2, "fromCurrent");
                if (interfaceC0002c2 instanceof AbstractC0061v) {
                    ((AbstractC0061v) interfaceC0002c2).T0(C0016q.f767a, interfaceC0002c);
                    return;
                }
                return;
        }
    }
}

package Q6;

import B6.n;
import C6.InterfaceC0002c;
import i7.AbstractC0898m;
import i7.C0896k;
import java.util.Collection;
import java.util.LinkedHashSet;
import s7.InterfaceC1521l;

/* loaded from: classes.dex */
public final class a extends AbstractC0898m {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1521l f4905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f4906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4907e;

    public a(InterfaceC1521l interfaceC1521l, LinkedHashSet linkedHashSet, boolean z8) {
        this.f4905c = interfaceC1521l;
        this.f4906d = linkedHashSet;
        this.f4907e = z8;
    }

    public static /* synthetic */ void a(int i4) {
        Object[] objArr = new Object[3];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "overridden";
                    }
                } else {
                    objArr[0] = "member";
                }
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3 && i4 != 4) {
                objArr[2] = "addFakeOverride";
            } else {
                objArr[2] = "setOverriddenDescriptors";
            }
        } else {
            objArr[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // i7.AbstractC0898m
    public final void b(InterfaceC0002c interfaceC0002c) {
        if (interfaceC0002c != null) {
            C0896k.r(interfaceC0002c, new n(8, this));
            this.f4906d.add(interfaceC0002c);
        } else {
            a(0);
            throw null;
        }
    }

    @Override // i7.AbstractC0898m
    public final void d(InterfaceC0002c interfaceC0002c, InterfaceC0002c interfaceC0002c2) {
        if (interfaceC0002c2 != null) {
            return;
        }
        a(2);
        throw null;
    }

    @Override // i7.AbstractC0898m
    public final void p(InterfaceC0002c interfaceC0002c, Collection collection) {
        if (interfaceC0002c != null) {
            if (this.f4907e && interfaceC0002c.e() != 2) {
                return;
            }
            interfaceC0002c.h0(collection);
            return;
        }
        a(3);
        throw null;
    }
}

package C6;

import i7.AbstractC0890e;
import q7.C1422c;
import q7.InterfaceC1423d;
import w7.AbstractC1759v;

/* renamed from: C6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014o {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f753b;

    public C0014o(h0 h0Var, int i4) {
        this.f753b = i4;
        o6.j.e(h0Var, "delegate");
        this.f752a = h0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c0, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0291 A[LOOP:1: B:131:0x0291->B:135:0x02c2, LOOP_START, PHI: r8
      0x0291: PHI (r8v2 C6.k) = (r8v0 C6.k), (r8v3 C6.k) binds: [B:130:0x028e, B:135:0x02c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r7v0, types: [C6.n, C6.k] */
    /* JADX WARN: Type inference failed for: r7v6, types: [C6.k] */
    /* JADX WARN: Type inference failed for: r7v7, types: [C6.k] */
    /* JADX WARN: Type inference failed for: r7v9, types: [C6.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(InterfaceC1423d interfaceC1423d, InterfaceC0013n interfaceC0013n, InterfaceC0010k interfaceC0010k) {
        InterfaceC0010k i4;
        InterfaceC0002c interfaceC0002c;
        InterfaceC0004e interfaceC0004e;
        switch (this.f753b) {
            case 0:
                if (interfaceC0010k != null) {
                    if (AbstractC0890e.r(interfaceC0013n) && AbstractC0890e.f(interfaceC0010k) != P.f727e) {
                        return AbstractC0015p.d(interfaceC0013n, interfaceC0010k);
                    }
                    if (interfaceC0013n instanceof InterfaceC0009j) {
                        ((InterfaceC0009j) interfaceC0013n).q();
                    }
                    while (interfaceC0013n != 0) {
                        interfaceC0013n = interfaceC0013n.q();
                        if ((!(interfaceC0013n instanceof InterfaceC0004e) || AbstractC0890e.l(interfaceC0013n)) && !(interfaceC0013n instanceof F)) {
                        }
                        if (interfaceC0013n != 0) {
                            while (true) {
                                if (interfaceC0010k != null) {
                                    if (interfaceC0013n == interfaceC0010k) {
                                        break;
                                    } else if (interfaceC0010k instanceof F) {
                                        if (!(interfaceC0013n instanceof F) || !((F6.E) interfaceC0013n).f1461i.equals(((F6.E) ((F) interfaceC0010k)).f1461i) || !AbstractC0890e.d(interfaceC0010k).equals(AbstractC0890e.d(interfaceC0013n))) {
                                        }
                                    } else {
                                        interfaceC0010k = interfaceC0010k.q();
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    if (interfaceC0013n != 0) {
                    }
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
            case 1:
                if (interfaceC0010k != null) {
                    if (AbstractC0015p.f754a.a(interfaceC1423d, interfaceC0013n, interfaceC0010k)) {
                        if (interfaceC1423d == AbstractC0015p.f763l) {
                            return true;
                        }
                        if (interfaceC1423d != AbstractC0015p.k && (i4 = AbstractC0890e.i(interfaceC0013n, InterfaceC0004e.class, true)) != null && (interfaceC1423d instanceof C1422c)) {
                            return ((C1422c) interfaceC1423d).f14217d.a().equals(i4.a());
                        }
                    }
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                if (interfaceC0010k != null) {
                    InterfaceC0004e interfaceC0004e2 = (InterfaceC0004e) AbstractC0890e.i(interfaceC0013n, InterfaceC0004e.class, true);
                    InterfaceC0004e interfaceC0004e3 = (InterfaceC0004e) AbstractC0890e.i(interfaceC0010k, InterfaceC0004e.class, false);
                    if (interfaceC0004e3 != null) {
                        if (interfaceC0004e2 != null && AbstractC0890e.l(interfaceC0004e2) && (interfaceC0004e = (InterfaceC0004e) AbstractC0890e.i(interfaceC0004e2, InterfaceC0004e.class, true)) != null && AbstractC0890e.q(interfaceC0004e3.l(), interfaceC0004e.a())) {
                            return true;
                        }
                        if (interfaceC0013n instanceof InterfaceC0002c) {
                            interfaceC0002c = AbstractC0890e.s((InterfaceC0002c) interfaceC0013n);
                        } else {
                            interfaceC0002c = interfaceC0013n;
                        }
                        InterfaceC0004e interfaceC0004e4 = (InterfaceC0004e) AbstractC0890e.i(interfaceC0002c, InterfaceC0004e.class, true);
                        if (interfaceC0004e4 != null) {
                            if (AbstractC0890e.q(interfaceC0004e3.l(), interfaceC0004e4.a()) && interfaceC1423d != AbstractC0015p.f764m) {
                                if (!(interfaceC0002c instanceof InterfaceC0002c) || (interfaceC0002c instanceof InterfaceC0009j) || interfaceC1423d == AbstractC0015p.f763l) {
                                    return true;
                                }
                                if (interfaceC1423d != AbstractC0015p.k && interfaceC1423d != null) {
                                    AbstractC1759v b4 = interfaceC1423d.b();
                                    if (AbstractC0890e.q(b4, interfaceC0004e3)) {
                                        return true;
                                    }
                                    b4.H0();
                                }
                            }
                            return a(interfaceC1423d, interfaceC0013n, interfaceC0004e3.q());
                        }
                    }
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                if (interfaceC0010k != null) {
                    if (!AbstractC0890e.d(interfaceC0010k).u(AbstractC0890e.d(interfaceC0013n))) {
                        return false;
                    }
                    AbstractC0015p.f765n.getClass();
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                if (interfaceC0010k != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                if (interfaceC0010k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (interfaceC0010k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (interfaceC0010k != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if (interfaceC0010k != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (interfaceC0010k != null) {
                    return P6.o.c(interfaceC0013n, interfaceC0010k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (interfaceC0010k != null) {
                    return P6.o.b(interfaceC1423d, interfaceC0013n, interfaceC0010k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (interfaceC0010k != null) {
                    return P6.o.b(interfaceC1423d, interfaceC0013n, interfaceC0010k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.f752a.d();
    }
}

package F6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import C6.InterfaceC0009j;
import C6.InterfaceC0010k;
import C6.InterfaceC0012m;
import C6.InterfaceC0019u;
import f7.AbstractC0727g;
import f7.C0725e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: F6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0050j extends AbstractC0061v implements InterfaceC0009j {

    /* renamed from: H, reason: collision with root package name */
    public final boolean f1536H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0050j(InterfaceC0004e interfaceC0004e, InterfaceC0009j interfaceC0009j, D6.j jVar, boolean z8, int i4, C6.O o7) {
        super(i4, interfaceC0004e, interfaceC0009j, o7, jVar, AbstractC0727g.f10812e);
        if (interfaceC0004e != null) {
            if (jVar != null) {
                if (i4 != 0) {
                    if (o7 != null) {
                        this.f1536H = z8;
                        return;
                    } else {
                        G0(3);
                        throw null;
                    }
                }
                G0(2);
                throw null;
            }
            G0(1);
            throw null;
        }
        G0(0);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        if (i4 != 21 && i4 != 27) {
            switch (i4) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i4 != 21 && i4 != 27) {
                switch (i4) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i8 = 3;
                        break;
                }
                Object[] objArr = new Object[i8];
                switch (i4) {
                    case 1:
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    case 25:
                        objArr[0] = "annotations";
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    case 24:
                        objArr[0] = "kind";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    case 9:
                    case 26:
                        objArr[0] = "source";
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    default:
                        objArr[0] = "containingDeclaration";
                        break;
                    case 10:
                    case 13:
                        objArr[0] = "unsubstitutedValueParameters";
                        break;
                    case 11:
                    case 14:
                        objArr[0] = "visibility";
                        break;
                    case 12:
                        objArr[0] = "typeParameterDescriptors";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                        break;
                    case 20:
                        objArr[0] = "originalSubstitutor";
                        break;
                    case 22:
                        objArr[0] = "overriddenDescriptors";
                        break;
                    case 23:
                        objArr[0] = "newOwner";
                        break;
                }
                if (i4 == 21) {
                    if (i4 != 27) {
                        switch (i4) {
                            case 15:
                            case 16:
                                objArr[1] = "calculateContextReceiverParameters";
                                break;
                            case 17:
                                objArr[1] = "getContainingDeclaration";
                                break;
                            case 18:
                                objArr[1] = "getConstructedClass";
                                break;
                            case 19:
                                objArr[1] = "getOriginal";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                                break;
                        }
                    } else {
                        objArr[1] = "copy";
                    }
                } else {
                    objArr[1] = "getOverriddenDescriptors";
                }
                switch (i4) {
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[2] = "create";
                        break;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    case 9:
                        objArr[2] = "createSynthesized";
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "initialize";
                        break;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 21:
                    case 27:
                        break;
                    case 20:
                        objArr[2] = "substitute";
                        break;
                    case 22:
                        objArr[2] = "setOverriddenDescriptors";
                        break;
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        objArr[2] = "createSubstitutedCopy";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 21 && i4 != 27) {
                    switch (i4) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i8 = 2;
            Object[] objArr2 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 21) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 21) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 21) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 21) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 21) {
            }
            throw new IllegalStateException(format22);
        }
        i8 = 2;
        Object[] objArr222 = new Object[i8];
        switch (i4) {
        }
        if (i4 == 21) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 21) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // C6.InterfaceC0009j
    public final boolean I() {
        return this.f1536H;
    }

    @Override // C6.InterfaceC0009j
    public final InterfaceC0004e J() {
        InterfaceC0004e q6 = q();
        if (q6 != null) {
            return q6;
        }
        G0(18);
        throw null;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.w(this, obj);
    }

    @Override // F6.AbstractC0061v
    /* renamed from: X0, reason: merged with bridge method [inline-methods] */
    public C0050j O0(int i4, InterfaceC0010k interfaceC0010k, InterfaceC0019u interfaceC0019u, C6.O o7, D6.j jVar, C0725e c0725e) {
        if (interfaceC0010k != null) {
            if (i4 != 0) {
                if (jVar != null) {
                    if (i4 != 1 && i4 != 4) {
                        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0010k + "\nkind: " + A.j.x(i4));
                    }
                    return new C0050j((InterfaceC0004e) interfaceC0010k, this, jVar, this.f1536H, 1, o7);
                }
                G0(25);
                throw null;
            }
            G0(24);
            throw null;
        }
        G0(23);
        throw null;
    }

    @Override // F6.AbstractC0055o, C6.InterfaceC0010k
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0004e q() {
        InterfaceC0004e interfaceC0004e = (InterfaceC0004e) super.q();
        if (interfaceC0004e != null) {
            return interfaceC0004e;
        }
        G0(17);
        throw null;
    }

    @Override // F6.AbstractC0061v, F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C0050j a() {
        C0050j c0050j = (C0050j) super.a();
        if (c0050j != null) {
            return c0050j;
        }
        G0(19);
        throw null;
    }

    public final void a1(List list, C0014o c0014o) {
        if (list != null) {
            if (c0014o != null) {
                b1(list, c0014o, q().t());
                return;
            } else {
                G0(14);
                throw null;
            }
        }
        G0(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b1(List list, C0014o c0014o, List list2) {
        w wVar;
        InterfaceC0004e q6;
        List list3;
        if (list != null) {
            if (c0014o != null) {
                if (list2 != null) {
                    InterfaceC0004e q8 = q();
                    if (q8.d0()) {
                        InterfaceC0010k q9 = q8.q();
                        if (q9 instanceof InterfaceC0004e) {
                            wVar = ((InterfaceC0004e) q9).F0();
                            q6 = q();
                            if (q6.x0().isEmpty()) {
                                list3 = q6.x0();
                                if (list3 == null) {
                                    G0(15);
                                    throw null;
                                }
                            } else {
                                list3 = Collections.EMPTY_LIST;
                                if (list3 == null) {
                                    G0(16);
                                    throw null;
                                }
                            }
                            R0(null, wVar, list3, list2, list, null, EnumC0023y.f778e, c0014o);
                            return;
                        }
                    }
                    wVar = null;
                    q6 = q();
                    if (q6.x0().isEmpty()) {
                    }
                    R0(null, wVar, list3, list2, list, null, EnumC0023y.f778e, c0014o);
                    return;
                }
                G0(12);
                throw null;
            }
            G0(11);
            throw null;
        }
        G0(10);
        throw null;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0019u, C6.Q
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public final C0050j f(w7.Q q6) {
        if (q6 != null) {
            return (C0050j) super.f(q6);
        }
        G0(20);
        throw null;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0002c
    public final void h0(Collection collection) {
        if (collection != null) {
            return;
        }
        G0(22);
        throw null;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0002c, C6.InterfaceC0001b
    public final Collection s() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        G0(21);
        throw null;
    }

    @Override // F6.AbstractC0061v, C6.InterfaceC0002c
    public final InterfaceC0002c x(InterfaceC0004e interfaceC0004e, EnumC0023y enumC0023y, C0014o c0014o) {
        return (C0050j) M0(interfaceC0004e, enumC0023y, c0014o);
    }
}

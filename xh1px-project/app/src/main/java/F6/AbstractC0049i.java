package F6;

import C6.InterfaceC0007h;
import C6.InterfaceC0010k;
import C6.InterfaceC0011l;
import C6.InterfaceC0012m;
import f7.C0725e;
import java.util.List;
import w7.X;

/* renamed from: F6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0049i extends AbstractC0055o implements C6.T {

    /* renamed from: i, reason: collision with root package name */
    public final X f1532i;
    public final boolean j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final v7.i f1533l;

    /* renamed from: m, reason: collision with root package name */
    public final v7.i f1534m;

    /* renamed from: n, reason: collision with root package name */
    public final v7.k f1535n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [v7.i, v7.h] */
    /* JADX WARN: Type inference failed for: r4v3, types: [v7.i, v7.h] */
    public AbstractC0049i(v7.n nVar, InterfaceC0010k interfaceC0010k, D6.j jVar, C0725e c0725e, X x8, boolean z8, int i4, C6.P p8) {
        super(interfaceC0010k, jVar, c0725e, C6.O.f726a);
        if (nVar != null) {
            if (interfaceC0010k != null) {
                if (jVar != null) {
                    if (c0725e != null) {
                        if (x8 != null) {
                            if (p8 != null) {
                                this.f1532i = x8;
                                this.j = z8;
                                this.k = i4;
                                C0047g c0047g = new C0047g(this, nVar, p8);
                                v7.k kVar = (v7.k) nVar;
                                this.f1533l = new v7.h(kVar, c0047g);
                                this.f1534m = new v7.h(kVar, new B6.f(this, c0725e, 4));
                                this.f1535n = kVar;
                                return;
                            }
                            G0(6);
                            throw null;
                        }
                        G0(4);
                        throw null;
                    }
                    G0(3);
                    throw null;
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

    public static /* synthetic */ void G0(int i4) {
        String str;
        int i8;
        switch (i4) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i8 = 2;
                break;
            case 12:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "annotations";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "name";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "variance";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "source";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "supertypeLoopChecker";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i4) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getVariance";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i4) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // C6.InterfaceC0007h
    public final w7.J B() {
        w7.J j = (w7.J) this.f1533l.a();
        if (j != null) {
            return j;
        }
        G0(9);
        throw null;
    }

    @Override // C6.T
    public final v7.n D() {
        v7.k kVar = this.f1535n;
        if (kVar != null) {
            return kVar;
        }
        G0(14);
        throw null;
    }

    @Override // C6.InterfaceC0010k
    public final Object K(InterfaceC0012m interfaceC0012m, Object obj) {
        return interfaceC0012m.K(this, obj);
    }

    public abstract List N0();

    @Override // C6.T
    public final boolean Q() {
        return false;
    }

    @Override // C6.T
    public final boolean R() {
        return this.j;
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    public final InterfaceC0007h a() {
        return this;
    }

    @Override // C6.T
    public final X e0() {
        X x8 = this.f1532i;
        if (x8 != null) {
            return x8;
        }
        G0(7);
        throw null;
    }

    @Override // C6.T
    public final int getIndex() {
        return this.k;
    }

    @Override // C6.T
    public final List getUpperBounds() {
        List d2 = ((C0048h) B()).d();
        if (d2 != null) {
            return d2;
        }
        G0(8);
        throw null;
    }

    @Override // C6.InterfaceC0007h
    public final w7.z l() {
        w7.z zVar = (w7.z) this.f1534m.a();
        if (zVar != null) {
            return zVar;
        }
        G0(10);
        throw null;
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    public final InterfaceC0010k a() {
        return this;
    }

    @Override // F6.AbstractC0055o, F6.AbstractC0054n, C6.InterfaceC0010k
    public final C6.T a() {
        return this;
    }

    @Override // F6.AbstractC0055o
    /* renamed from: L0 */
    public final InterfaceC0011l a() {
        return this;
    }

    public List M0(List list) {
        return list;
    }
}

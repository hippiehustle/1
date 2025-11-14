package F6;

import C6.C0014o;
import C6.EnumC0023y;
import C6.InterfaceC0010k;
import C6.InterfaceC0018t;
import C6.InterfaceC0019u;
import f7.C0725e;
import java.util.LinkedHashMap;
import java.util.List;
import w7.AbstractC1759v;

/* renamed from: F6.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0060u implements InterfaceC0018t {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ AbstractC0061v f1558A;

    /* renamed from: d, reason: collision with root package name */
    public w7.O f1559d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0010k f1560e;

    /* renamed from: f, reason: collision with root package name */
    public EnumC0023y f1561f;

    /* renamed from: g, reason: collision with root package name */
    public C0014o f1562g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0019u f1563h;

    /* renamed from: i, reason: collision with root package name */
    public int f1564i;
    public List j;
    public final List k;

    /* renamed from: l, reason: collision with root package name */
    public w f1565l;

    /* renamed from: m, reason: collision with root package name */
    public w f1566m;

    /* renamed from: n, reason: collision with root package name */
    public AbstractC1759v f1567n;

    /* renamed from: o, reason: collision with root package name */
    public C0725e f1568o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1569p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1570q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1571r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1572s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1573t;

    /* renamed from: u, reason: collision with root package name */
    public a6.s f1574u;

    /* renamed from: v, reason: collision with root package name */
    public D6.j f1575v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1576w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashMap f1577x;

    /* renamed from: y, reason: collision with root package name */
    public Boolean f1578y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f1579z;

    public C0060u(AbstractC0061v abstractC0061v, w7.O o7, InterfaceC0010k interfaceC0010k, EnumC0023y enumC0023y, C0014o c0014o, int i4, List list, List list2, w wVar, AbstractC1759v abstractC1759v) {
        if (o7 != null) {
            if (interfaceC0010k != null) {
                if (enumC0023y != null) {
                    if (c0014o != null) {
                        if (i4 != 0) {
                            if (list != null) {
                                if (list2 != null) {
                                    if (abstractC1759v != null) {
                                        this.f1558A = abstractC0061v;
                                        this.f1563h = null;
                                        this.f1566m = abstractC0061v.f1590n;
                                        this.f1569p = true;
                                        this.f1570q = false;
                                        this.f1571r = false;
                                        this.f1572s = false;
                                        this.f1573t = abstractC0061v.f1599w;
                                        this.f1574u = null;
                                        this.f1575v = null;
                                        this.f1576w = abstractC0061v.f1600x;
                                        this.f1577x = new LinkedHashMap();
                                        this.f1578y = null;
                                        this.f1579z = false;
                                        this.f1559d = o7;
                                        this.f1560e = interfaceC0010k;
                                        this.f1561f = enumC0023y;
                                        this.f1562g = c0014o;
                                        this.f1564i = i4;
                                        this.j = list;
                                        this.k = list2;
                                        this.f1565l = wVar;
                                        this.f1567n = abstractC1759v;
                                        this.f1568o = null;
                                        return;
                                    }
                                    b(7);
                                    throw null;
                                }
                                b(6);
                                throw null;
                            }
                            b(5);
                            throw null;
                        }
                        b(4);
                        throw null;
                    }
                    b(3);
                    throw null;
                }
                b(2);
                throw null;
            }
            b(1);
            throw null;
        }
        b(0);
        throw null;
    }

    public static /* synthetic */ void b(int i4) {
        String str;
        int i8;
        switch (i4) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i4) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                i8 = 2;
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                i8 = 3;
                break;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case 1:
                objArr[0] = "newOwner";
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "newModality";
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "newVisibility";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
            case 14:
                objArr[0] = "kind";
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                objArr[0] = "newValueParameterDescriptors";
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "newContextReceiverParameters";
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "newReturnType";
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[0] = "owner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 10:
                objArr[0] = "modality";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 17:
                objArr[0] = "name";
                break;
            case 19:
            case 21:
                objArr[0] = "parameters";
                break;
            case 23:
                objArr[0] = "type";
                break;
            case 25:
                objArr[0] = "contextReceiverParameters";
                break;
            case 35:
                objArr[0] = "additionalAnnotations";
                break;
            case 37:
            default:
                objArr[0] = "substitution";
                break;
            case 39:
                objArr[0] = "userDataKey";
                break;
        }
        switch (i4) {
            case 9:
                objArr[1] = "setOwner";
                break;
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                break;
            case 11:
                objArr[1] = "setModality";
                break;
            case 13:
                objArr[1] = "setVisibility";
                break;
            case 15:
                objArr[1] = "setKind";
                break;
            case 16:
                objArr[1] = "setCopyOverrides";
                break;
            case 18:
                objArr[1] = "setName";
                break;
            case 20:
                objArr[1] = "setValueParameters";
                break;
            case 22:
                objArr[1] = "setTypeParameters";
                break;
            case 24:
                objArr[1] = "setReturnType";
                break;
            case 26:
                objArr[1] = "setContextReceiverParameters";
                break;
            case 27:
                objArr[1] = "setExtensionReceiverParameter";
                break;
            case 28:
                objArr[1] = "setDispatchReceiverParameter";
                break;
            case 29:
                objArr[1] = "setOriginal";
                break;
            case 30:
                objArr[1] = "setSignatureChange";
                break;
            case 31:
                objArr[1] = "setPreserveSourceElement";
                break;
            case 32:
                objArr[1] = "setDropOriginalInContainingParts";
                break;
            case 33:
                objArr[1] = "setHiddenToOvercomeSignatureClash";
                break;
            case 34:
                objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                break;
            case 36:
                objArr[1] = "setAdditionalAnnotations";
                break;
            case 38:
                objArr[1] = "setSubstitution";
                break;
            case 40:
                objArr[1] = "putUserData";
                break;
            case 41:
                objArr[1] = "getSubstitution";
                break;
            case 42:
                objArr[1] = "setJustForTypeSubstitution";
                break;
        }
        switch (i4) {
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                objArr[2] = "setOwner";
                break;
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                break;
            case 10:
                objArr[2] = "setModality";
                break;
            case 12:
                objArr[2] = "setVisibility";
                break;
            case 14:
                objArr[2] = "setKind";
                break;
            case 17:
                objArr[2] = "setName";
                break;
            case 19:
                objArr[2] = "setValueParameters";
                break;
            case 21:
                objArr[2] = "setTypeParameters";
                break;
            case 23:
                objArr[2] = "setReturnType";
                break;
            case 25:
                objArr[2] = "setContextReceiverParameters";
                break;
            case 35:
                objArr[2] = "setAdditionalAnnotations";
                break;
            case 37:
                objArr[2] = "setSubstitution";
                break;
            case 39:
                objArr[2] = "putUserData";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i4) {
            case 9:
            case 11:
            case 13:
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 38:
            case 40:
            case 41:
            case 42:
                throw new IllegalStateException(format);
            case 10:
            case 12:
            case 14:
            case 17:
            case 19:
            case 21:
            case 23:
            case 25:
            case 35:
            case 37:
            case 39:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t a() {
        this.f1569p = false;
        return this;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0019u build() {
        return this.f1558A.P0(this);
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t c(List list) {
        this.j = list;
        return this;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t d(EnumC0023y enumC0023y) {
        if (enumC0023y != null) {
            this.f1561f = enumC0023y;
            return this;
        }
        b(10);
        throw null;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t e() {
        this.f1574u = a6.s.f7766d;
        return this;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t f(D6.j jVar) {
        if (jVar != null) {
            this.f1575v = jVar;
            return this;
        }
        b(35);
        throw null;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t g() {
        this.f1573t = true;
        return this;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t h(AbstractC1759v abstractC1759v) {
        if (abstractC1759v != null) {
            this.f1567n = abstractC1759v;
            return this;
        }
        b(23);
        throw null;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t i(int i4) {
        if (i4 != 0) {
            this.f1564i = i4;
            return this;
        }
        b(14);
        throw null;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t j() {
        this.f1571r = true;
        return this;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t k(C0014o c0014o) {
        if (c0014o != null) {
            this.f1562g = c0014o;
            return this;
        }
        b(12);
        throw null;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t l(InterfaceC0010k interfaceC0010k) {
        if (interfaceC0010k != null) {
            this.f1560e = interfaceC0010k;
            return this;
        }
        b(8);
        throw null;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t m() {
        this.f1577x.put(R6.f.K, Boolean.TRUE);
        return this;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t n() {
        this.f1576w = true;
        return this;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t o(w wVar) {
        this.f1566m = wVar;
        return this;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t p(C0725e c0725e) {
        if (c0725e != null) {
            this.f1568o = c0725e;
            return this;
        }
        b(17);
        throw null;
    }

    @Override // C6.InterfaceC0018t
    public final InterfaceC0018t q() {
        this.f1570q = true;
        return this;
    }
}

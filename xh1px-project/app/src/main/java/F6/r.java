package F6;

import f7.C0725e;
import i7.C0896k;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import n6.InterfaceC1163b;
import p7.AbstractC1334p;
import p7.C1324f;
import p7.InterfaceC1333o;
import w7.AbstractC1744f;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class r extends AbstractC1334p {

    /* renamed from: b */
    public final v7.e f1552b;

    /* renamed from: c */
    public final v7.e f1553c;

    /* renamed from: d */
    public final v7.i f1554d;

    /* renamed from: e */
    public final /* synthetic */ C0058s f1555e;

    /* JADX WARN: Type inference failed for: r0v3, types: [v7.i, v7.h] */
    public r(C0058s c0058s, v7.n nVar) {
        if (nVar != null) {
            this.f1555e = c0058s;
            v7.k kVar = (v7.k) nVar;
            this.f1552b = kVar.b(new C0056p(this, 0));
            this.f1553c = kVar.b(new C0056p(this, 1));
            this.f1554d = new v7.h(kVar, new B6.j(5, this));
            return;
        }
        h(0);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void h(int i4) {
        String str;
        int i8;
        if (i4 != 3 && i4 != 7 && i4 != 9 && i4 != 12) {
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
            if (i4 != 3 && i4 != 7 && i4 != 9 && i4 != 12) {
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
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    case 10:
                        objArr[0] = "name";
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[0] = "location";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                    case 11:
                        objArr[0] = "fromSupertypes";
                        break;
                    case 13:
                        objArr[0] = "kindFilter";
                        break;
                    case 14:
                        objArr[0] = "nameFilter";
                        break;
                    case 20:
                        objArr[0] = "p";
                        break;
                    default:
                        objArr[0] = "storageManager";
                        break;
                }
                if (i4 == 3) {
                    if (i4 != 7) {
                        if (i4 != 9) {
                            if (i4 != 12) {
                                switch (i4) {
                                    case 15:
                                        objArr[1] = "getContributedDescriptors";
                                        break;
                                    case 16:
                                        objArr[1] = "computeAllDeclarations";
                                        break;
                                    case 17:
                                        objArr[1] = "getFunctionNames";
                                        break;
                                    case 18:
                                        objArr[1] = "getClassifierNames";
                                        break;
                                    case 19:
                                        objArr[1] = "getVariableNames";
                                        break;
                                    default:
                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                        break;
                                }
                            } else {
                                objArr[1] = "resolveFakeOverrides";
                            }
                        } else {
                            objArr[1] = "getSupertypeScope";
                        }
                    } else {
                        objArr[1] = "getContributedFunctions";
                    }
                } else {
                    objArr[1] = "getContributedVariables";
                }
                switch (i4) {
                    case 1:
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        objArr[2] = "getContributedVariables";
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 9:
                    case 12:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        objArr[2] = "computeProperties";
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        objArr[2] = "getContributedFunctions";
                        break;
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        objArr[2] = "computeFunctions";
                        break;
                    case 10:
                    case 11:
                        objArr[2] = "resolveFakeOverrides";
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "getContributedDescriptors";
                        break;
                    case 20:
                        objArr[2] = "printScopeStructure";
                        break;
                    default:
                        objArr[2] = "<init>";
                        break;
                }
                String format = String.format(str, objArr);
                if (i4 != 3 && i4 != 7 && i4 != 9 && i4 != 12) {
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
            if (i4 == 3) {
            }
            switch (i4) {
            }
            String format2 = String.format(str, objArr2);
            if (i4 != 3) {
                switch (i4) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i4 != 3) {
            switch (i4) {
            }
            Object[] objArr22 = new Object[i8];
            switch (i4) {
            }
            if (i4 == 3) {
            }
            switch (i4) {
            }
            String format22 = String.format(str, objArr22);
            if (i4 != 3) {
            }
            throw new IllegalStateException(format22);
        }
        i8 = 2;
        Object[] objArr222 = new Object[i8];
        switch (i4) {
        }
        if (i4 == 3) {
        }
        switch (i4) {
        }
        String format222 = String.format(str, objArr222);
        if (i4 != 3) {
        }
        throw new IllegalStateException(format222);
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1335q
    public final Collection a(C1324f c1324f, InterfaceC1163b interfaceC1163b) {
        if (c1324f != null) {
            Collection collection = (Collection) this.f1554d.a();
            if (collection != null) {
                return collection;
            }
            h(15);
            throw null;
        }
        h(13);
        throw null;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set b() {
        Set set = (Set) this.f1555e.f1556l.a();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set c() {
        Set set = (Set) this.f1555e.f1556l.a();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Set e() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection f(C0725e c0725e, K6.b bVar) {
        if (c0725e != null) {
            return (Collection) this.f1553c.m(c0725e);
        }
        h(1);
        throw null;
    }

    @Override // p7.AbstractC1334p, p7.InterfaceC1333o
    public final Collection g(C0725e c0725e, K6.b bVar) {
        if (c0725e != null) {
            return (Collection) this.f1552b.m(c0725e);
        }
        h(5);
        throw null;
    }

    public final InterfaceC1333o i() {
        InterfaceC1333o w02 = ((AbstractC1759v) ((AbstractC1744f) this.f1555e.B()).d().iterator().next()).w0();
        if (w02 != null) {
            return w02;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(C0725e c0725e, Collection collection) {
        if (c0725e != null) {
            if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C0896k.f11782c.h(c0725e, collection, Collections.EMPTY_SET, this.f1555e, new C0057q(linkedHashSet, 0));
                return linkedHashSet;
            }
            h(11);
            throw null;
        }
        h(10);
        throw null;
    }
}

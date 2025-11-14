package Y0;

import A.j;
import R3.r;
import Z.g;
import d8.f;
import d8.i;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: o, reason: collision with root package name */
    public static final d8.c f7082o = d8.c.a("'\\");

    /* renamed from: p, reason: collision with root package name */
    public static final d8.c f7083p = d8.c.a("\"\\");

    /* renamed from: q, reason: collision with root package name */
    public static final d8.c f7084q = d8.c.a("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: i, reason: collision with root package name */
    public final i f7085i;
    public final d8.a j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public long f7086l;

    /* renamed from: m, reason: collision with root package name */
    public int f7087m;

    /* renamed from: n, reason: collision with root package name */
    public String f7088n;

    static {
        d8.c.a("\n\r");
        d8.c.a("*/");
    }

    public d(i iVar) {
        this.f7079e = new int[32];
        this.f7080f = new String[32];
        this.f7081g = new int[32];
        this.k = 0;
        this.f7085i = iVar;
        this.j = iVar.f10542e;
        I(6);
    }

    @Override // Y0.c
    public final String B() {
        String n3;
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 10) {
            n3 = X();
        } else if (i4 == 9) {
            n3 = W(f7083p);
        } else if (i4 == 8) {
            n3 = W(f7082o);
        } else if (i4 == 11) {
            n3 = this.f7088n;
            this.f7088n = null;
        } else if (i4 == 16) {
            n3 = Long.toString(this.f7086l);
        } else if (i4 == 17) {
            long j = this.f7087m;
            d8.a aVar = this.j;
            aVar.getClass();
            n3 = aVar.n(j, I7.a.f2219a);
        } else {
            throw new RuntimeException("Expected a string but was " + j.y(D()) + " at path " + n());
        }
        this.k = 0;
        int[] iArr = this.f7081g;
        int i8 = this.f7078d - 1;
        iArr[i8] = iArr[i8] + 1;
        return n3;
    }

    @Override // Y0.c
    public final int D() {
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        switch (i4) {
            case 1:
                return 3;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                return 4;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                return 1;
            case g.LONG_FIELD_NUMBER /* 4 */:
                return 2;
            case g.STRING_FIELD_NUMBER /* 5 */:
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case g.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r6 = -1;
     */
    @Override // Y0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int M(r rVar) {
        int a3;
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 < 12 || i4 > 15) {
            return -1;
        }
        if (i4 == 15) {
            return S(this.f7088n, rVar);
        }
        f fVar = (f) rVar.f5083f;
        i iVar = this.f7085i;
        d8.a aVar = iVar.f10542e;
        if (iVar.f10543f) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            a3 = e8.a.a(aVar, fVar, true);
            if (a3 != -2) {
                if (a3 != -1) {
                    aVar.p(fVar.f10532d[a3].b());
                }
            } else if (iVar.f10541d.h(aVar, 8192L) == -1) {
                break;
            }
        }
        if (a3 != -1) {
            this.k = 0;
            this.f7080f[this.f7078d - 1] = ((String[]) rVar.f5082e)[a3];
            return a3;
        }
        String str = this.f7080f[this.f7078d - 1];
        String U8 = U();
        int S8 = S(U8, rVar);
        if (S8 == -1) {
            this.k = 15;
            this.f7088n = U8;
            this.f7080f[this.f7078d - 1] = str;
        }
        return S8;
    }

    @Override // Y0.c
    public final void N() {
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 14) {
            long a3 = this.f7085i.a(f7084q);
            d8.a aVar = this.j;
            if (a3 == -1) {
                a3 = aVar.f10525e;
            }
            aVar.p(a3);
        } else if (i4 == 13) {
            Z(f7083p);
        } else if (i4 == 12) {
            Z(f7082o);
        } else if (i4 != 15) {
            throw new RuntimeException("Expected a name but was " + j.y(D()) + " at path " + n());
        }
        this.k = 0;
        this.f7080f[this.f7078d - 1] = "null";
    }

    @Override // Y0.c
    public final void O() {
        int i4 = 0;
        do {
            int i8 = this.k;
            if (i8 == 0) {
                i8 = R();
            }
            if (i8 == 3) {
                I(1);
            } else if (i8 == 1) {
                I(3);
            } else {
                if (i8 == 4) {
                    i4--;
                    if (i4 >= 0) {
                        this.f7078d--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + j.y(D()) + " at path " + n());
                    }
                } else if (i8 == 2) {
                    i4--;
                    if (i4 >= 0) {
                        this.f7078d--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + j.y(D()) + " at path " + n());
                    }
                } else {
                    d8.a aVar = this.j;
                    if (i8 != 14 && i8 != 10) {
                        if (i8 != 9 && i8 != 13) {
                            if (i8 != 8 && i8 != 12) {
                                if (i8 == 17) {
                                    aVar.p(this.f7087m);
                                } else if (i8 == 18) {
                                    throw new RuntimeException("Expected a value but was " + j.y(D()) + " at path " + n());
                                }
                            } else {
                                Z(f7082o);
                            }
                        } else {
                            Z(f7083p);
                        }
                    } else {
                        long a3 = this.f7085i.a(f7084q);
                        if (a3 == -1) {
                            a3 = aVar.f10525e;
                        }
                        aVar.p(a3);
                    }
                }
                this.k = 0;
            }
            i4++;
            this.k = 0;
        } while (i4 != 0);
        int[] iArr = this.f7081g;
        int i9 = this.f7078d - 1;
        iArr[i9] = iArr[i9] + 1;
        this.f7080f[i9] = "null";
    }

    public final void Q() {
        P("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bb, code lost:
    
        if (r1 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01be, code lost:
    
        if (r1 != 7) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        r22.f7087m = r2;
        r9 = 17;
        r22.k = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
    
        if (T(r10) != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0197, code lost:
    
        if (r1 != 2) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0199, code lost:
    
        if (r4 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019f, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a1, code lost:
    
        if (r13 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (r8 != r17) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a7, code lost:
    
        if (r13 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a9, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ad, code lost:
    
        r22.f7086l = r8;
        r7.p(r2);
        r9 = 16;
        r22.k = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b8, code lost:
    
        if (r1 == 2) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int R() {
        String str;
        String str2;
        int i4;
        long j;
        byte a3;
        int i8;
        char c6;
        boolean z8;
        int[] iArr = this.f7079e;
        int i9 = this.f7078d - 1;
        int i10 = iArr[i9];
        d8.a aVar = this.j;
        if (i10 == 1) {
            iArr[i9] = 2;
        } else if (i10 == 2) {
            int V6 = V(true);
            aVar.d();
            if (V6 != 44) {
                if (V6 != 59) {
                    if (V6 == 93) {
                        this.k = 4;
                        return 4;
                    }
                    P("Unterminated array");
                    throw null;
                }
                Q();
                throw null;
            }
        } else if (i10 != 3 && i10 != 5) {
            if (i10 == 4) {
                iArr[i9] = 5;
                int V8 = V(true);
                aVar.d();
                if (V8 != 58) {
                    if (V8 != 61) {
                        P("Expected ':'");
                        throw null;
                    }
                    Q();
                    throw null;
                }
            } else if (i10 == 6) {
                iArr[i9] = 7;
            } else {
                if (i10 == 7) {
                    if (V(false) == -1) {
                        this.k = 18;
                        return 18;
                    }
                    Q();
                    throw null;
                }
                if (i10 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        } else {
            iArr[i9] = 4;
            if (i10 == 5) {
                int V9 = V(true);
                aVar.d();
                if (V9 != 44) {
                    if (V9 != 59) {
                        if (V9 == 125) {
                            this.k = 2;
                            return 2;
                        }
                        P("Unterminated object");
                        throw null;
                    }
                    Q();
                    throw null;
                }
            }
            int V10 = V(true);
            if (V10 != 34) {
                if (V10 != 39) {
                    if (V10 == 125) {
                        if (i10 != 5) {
                            aVar.d();
                            this.k = 2;
                            return 2;
                        }
                        P("Expected name");
                        throw null;
                    }
                    Q();
                    throw null;
                }
                aVar.d();
                Q();
                throw null;
            }
            aVar.d();
            this.k = 13;
            return 13;
        }
        int V11 = V(true);
        if (V11 != 34) {
            if (V11 != 39) {
                if (V11 != 44 && V11 != 59) {
                    if (V11 != 91) {
                        if (V11 != 93) {
                            if (V11 != 123) {
                                byte a4 = aVar.a(0L);
                                i iVar = this.f7085i;
                                if (a4 != 116 && a4 != 84) {
                                    if (a4 != 102 && a4 != 70) {
                                        if (a4 != 110 && a4 != 78) {
                                            j = 0;
                                            i4 = 0;
                                            if (i4 == 0) {
                                                return i4;
                                            }
                                            boolean z9 = true;
                                            long j5 = j;
                                            char c9 = 0;
                                            int i11 = 0;
                                            boolean z10 = false;
                                            while (true) {
                                                int i12 = i11 + 1;
                                                if (!iVar.o(i12)) {
                                                    break;
                                                }
                                                byte a9 = aVar.a(i11);
                                                if (a9 != 43) {
                                                    if (a9 != 69 && a9 != 101) {
                                                        if (a9 != 45) {
                                                            if (a9 != 46) {
                                                                if (a9 < 48 || a9 > 57) {
                                                                    break;
                                                                }
                                                                if (c9 == 1 || c9 == 0) {
                                                                    c6 = 6;
                                                                    j5 = -(a9 - 48);
                                                                    c9 = 2;
                                                                } else {
                                                                    if (c9 == 2) {
                                                                        if (j5 == j) {
                                                                            break;
                                                                        }
                                                                        long j8 = (10 * j5) - (a9 - 48);
                                                                        if (j5 <= -922337203685477580L && (j5 != -922337203685477580L || j8 >= j5)) {
                                                                            z8 = false;
                                                                        } else {
                                                                            z8 = true;
                                                                        }
                                                                        z9 &= z8;
                                                                        j5 = j8;
                                                                    } else if (c9 == 3) {
                                                                        c9 = 4;
                                                                    } else {
                                                                        c6 = 6;
                                                                        if (c9 == 5 || c9 == 6) {
                                                                            c9 = 7;
                                                                        }
                                                                    }
                                                                    c6 = 6;
                                                                    i11 = i12;
                                                                }
                                                                i11 = i12;
                                                            } else {
                                                                c6 = 6;
                                                                if (c9 != 2) {
                                                                    break;
                                                                }
                                                                c9 = 3;
                                                                i11 = i12;
                                                            }
                                                        } else {
                                                            c6 = 6;
                                                            if (c9 == 0) {
                                                                c9 = 1;
                                                                z10 = true;
                                                                i11 = i12;
                                                            } else {
                                                                if (c9 != 5) {
                                                                    break;
                                                                }
                                                                c9 = c6;
                                                                i11 = i12;
                                                            }
                                                        }
                                                    } else {
                                                        c6 = 6;
                                                        if (c9 != 2 && c9 != 4) {
                                                            break;
                                                        }
                                                        c9 = 5;
                                                        i11 = i12;
                                                    }
                                                    if (i8 == 0) {
                                                        return i8;
                                                    }
                                                    if (!T(aVar.a(j))) {
                                                        P("Expected value");
                                                        throw null;
                                                    }
                                                    Q();
                                                    throw null;
                                                }
                                                c6 = 6;
                                                if (c9 != 5) {
                                                    break;
                                                }
                                                c9 = c6;
                                                i11 = i12;
                                            }
                                            i8 = 0;
                                            if (i8 == 0) {
                                            }
                                        } else {
                                            str = "null";
                                            str2 = "NULL";
                                            i4 = 7;
                                        }
                                    } else {
                                        str = "false";
                                        str2 = "FALSE";
                                        i4 = 6;
                                    }
                                } else {
                                    str = "true";
                                    str2 = "TRUE";
                                    i4 = 5;
                                }
                                int length = str.length();
                                j = 0;
                                int i13 = 1;
                                while (true) {
                                    if (i13 < length) {
                                        int i14 = i13 + 1;
                                        if (!iVar.o(i14) || ((a3 = aVar.a(i13)) != str.charAt(i13) && a3 != str2.charAt(i13))) {
                                            break;
                                        }
                                        i13 = i14;
                                    } else if (!iVar.o(length + 1) || !T(aVar.a(length))) {
                                        aVar.p(length);
                                        this.k = i4;
                                    }
                                }
                                i4 = 0;
                                if (i4 == 0) {
                                }
                            } else {
                                aVar.d();
                                this.k = 1;
                                return 1;
                            }
                        } else if (i10 == 1) {
                            aVar.d();
                            this.k = 4;
                            return 4;
                        }
                    } else {
                        aVar.d();
                        this.k = 3;
                        return 3;
                    }
                }
                if (i10 != 1 && i10 != 2) {
                    P("Unexpected value");
                    throw null;
                }
                Q();
                throw null;
            }
            Q();
            throw null;
        }
        aVar.d();
        this.k = 9;
        return 9;
    }

    public final int S(String str, r rVar) {
        int length = ((String[]) rVar.f5082e).length;
        for (int i4 = 0; i4 < length; i4++) {
            if (str.equals(((String[]) rVar.f5082e)[i4])) {
                this.k = 0;
                this.f7080f[this.f7078d - 1] = str;
                return i4;
            }
        }
        return -1;
    }

    public final boolean T(int i4) {
        if (i4 != 9 && i4 != 10 && i4 != 12 && i4 != 13 && i4 != 32) {
            if (i4 != 35) {
                if (i4 != 44) {
                    if (i4 != 47 && i4 != 61) {
                        if (i4 != 123 && i4 != 125 && i4 != 58) {
                            if (i4 != 59) {
                                switch (i4) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            Q();
            throw null;
        }
        return false;
    }

    public final String U() {
        String str;
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 14) {
            str = X();
        } else if (i4 == 13) {
            str = W(f7083p);
        } else if (i4 == 12) {
            str = W(f7082o);
        } else if (i4 == 15) {
            str = this.f7088n;
        } else {
            throw new RuntimeException("Expected a name but was " + j.y(D()) + " at path " + n());
        }
        this.k = 0;
        this.f7080f[this.f7078d - 1] = str;
        return str;
    }

    public final int V(boolean z8) {
        int i4 = 0;
        while (true) {
            int i8 = i4 + 1;
            i iVar = this.f7085i;
            if (iVar.o(i8)) {
                long j = i4;
                d8.a aVar = this.j;
                byte a3 = aVar.a(j);
                if (a3 != 10 && a3 != 32 && a3 != 13 && a3 != 9) {
                    aVar.p(j);
                    if (a3 == 47) {
                        if (iVar.o(2L)) {
                            Q();
                            throw null;
                        }
                    } else if (a3 == 35) {
                        Q();
                        throw null;
                    }
                    return a3;
                }
                i4 = i8;
            } else {
                if (!z8) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }

    public final String W(d8.c cVar) {
        StringBuilder sb = null;
        while (true) {
            long a3 = this.f7085i.a(cVar);
            if (a3 != -1) {
                d8.a aVar = this.j;
                if (aVar.a(a3) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(aVar.n(a3, I7.a.f2219a));
                    aVar.d();
                    sb.append(Y());
                } else {
                    if (sb == null) {
                        String n3 = aVar.n(a3, I7.a.f2219a);
                        aVar.d();
                        return n3;
                    }
                    sb.append(aVar.n(a3, I7.a.f2219a));
                    aVar.d();
                    return sb.toString();
                }
            } else {
                P("Unterminated string");
                throw null;
            }
        }
    }

    public final String X() {
        long a3 = this.f7085i.a(f7084q);
        d8.a aVar = this.j;
        if (a3 != -1) {
            aVar.getClass();
            return aVar.n(a3, I7.a.f2219a);
        }
        return aVar.n(aVar.f10525e, I7.a.f2219a);
    }

    public final char Y() {
        int i4;
        i iVar = this.f7085i;
        if (iVar.o(1L)) {
            d8.a aVar = this.j;
            byte d2 = aVar.d();
            if (d2 != 10 && d2 != 34 && d2 != 39 && d2 != 47 && d2 != 92) {
                if (d2 != 98) {
                    if (d2 != 102) {
                        if (d2 == 110) {
                            return '\n';
                        }
                        if (d2 != 114) {
                            if (d2 != 116) {
                                if (d2 == 117) {
                                    if (iVar.o(4L)) {
                                        char c6 = 0;
                                        for (int i8 = 0; i8 < 4; i8++) {
                                            byte a3 = aVar.a(i8);
                                            char c9 = (char) (c6 << 4);
                                            if (a3 >= 48 && a3 <= 57) {
                                                i4 = a3 - 48;
                                            } else if (a3 >= 97 && a3 <= 102) {
                                                i4 = a3 - 87;
                                            } else {
                                                if (a3 < 65 || a3 > 70) {
                                                    P("\\u".concat(aVar.n(4L, I7.a.f2219a)));
                                                    throw null;
                                                }
                                                i4 = a3 - 55;
                                            }
                                            c6 = (char) (i4 + c9);
                                        }
                                        aVar.p(4L);
                                        return c6;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + n());
                                }
                                P("Invalid escape sequence: \\" + ((char) d2));
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) d2;
        }
        P("Unterminated escape sequence");
        throw null;
    }

    public final void Z(d8.c cVar) {
        while (true) {
            long a3 = this.f7085i.a(cVar);
            if (a3 != -1) {
                d8.a aVar = this.j;
                if (aVar.a(a3) == 92) {
                    aVar.p(a3 + 1);
                    Y();
                } else {
                    aVar.p(a3 + 1);
                    return;
                }
            } else {
                P("Unterminated string");
                throw null;
            }
        }
    }

    @Override // Y0.c
    public final void a() {
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 3) {
            I(1);
            this.f7081g[this.f7078d - 1] = 0;
            this.k = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_ARRAY but was " + j.y(D()) + " at path " + n());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.k = 0;
        this.f7079e[0] = 8;
        this.f7078d = 1;
        d8.a aVar = this.j;
        aVar.p(aVar.f10525e);
        this.f7085i.close();
    }

    @Override // Y0.c
    public final void d() {
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 1) {
            I(3);
            this.k = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_OBJECT but was " + j.y(D()) + " at path " + n());
        }
    }

    @Override // Y0.c
    public final void e() {
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 4) {
            int i8 = this.f7078d;
            this.f7078d = i8 - 1;
            int[] iArr = this.f7081g;
            int i9 = i8 - 2;
            iArr[i9] = iArr[i9] + 1;
            this.k = 0;
            return;
        }
        throw new RuntimeException("Expected END_ARRAY but was " + j.y(D()) + " at path " + n());
    }

    @Override // Y0.c
    public final void j() {
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 2) {
            int i8 = this.f7078d;
            int i9 = i8 - 1;
            this.f7078d = i9;
            this.f7080f[i9] = null;
            int[] iArr = this.f7081g;
            int i10 = i8 - 2;
            iArr[i10] = iArr[i10] + 1;
            this.k = 0;
            return;
        }
        throw new RuntimeException("Expected END_OBJECT but was " + j.y(D()) + " at path " + n());
    }

    @Override // Y0.c
    public final boolean p() {
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 != 2 && i4 != 4 && i4 != 18) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "JsonReader(" + this.f7085i + ")";
    }

    @Override // Y0.c
    public final boolean v() {
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 5) {
            this.k = 0;
            int[] iArr = this.f7081g;
            int i8 = this.f7078d - 1;
            iArr[i8] = iArr[i8] + 1;
            return true;
        }
        if (i4 == 6) {
            this.k = 0;
            int[] iArr2 = this.f7081g;
            int i9 = this.f7078d - 1;
            iArr2[i9] = iArr2[i9] + 1;
            return false;
        }
        throw new RuntimeException("Expected a boolean but was " + j.y(D()) + " at path " + n());
    }

    @Override // Y0.c
    public final double y() {
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 16) {
            this.k = 0;
            int[] iArr = this.f7081g;
            int i8 = this.f7078d - 1;
            iArr[i8] = iArr[i8] + 1;
            return this.f7086l;
        }
        if (i4 == 17) {
            long j = this.f7087m;
            d8.a aVar = this.j;
            aVar.getClass();
            this.f7088n = aVar.n(j, I7.a.f2219a);
        } else if (i4 == 9) {
            this.f7088n = W(f7083p);
        } else if (i4 == 8) {
            this.f7088n = W(f7082o);
        } else if (i4 == 10) {
            this.f7088n = X();
        } else if (i4 != 11) {
            throw new RuntimeException("Expected a double but was " + j.y(D()) + " at path " + n());
        }
        this.k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f7088n);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.f7088n = null;
                this.k = 0;
                int[] iArr2 = this.f7081g;
                int i9 = this.f7078d - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return parseDouble;
            }
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + n());
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Expected a double but was " + this.f7088n + " at path " + n());
        }
    }

    @Override // Y0.c
    public final int z() {
        String W7;
        int i4 = this.k;
        if (i4 == 0) {
            i4 = R();
        }
        if (i4 == 16) {
            long j = this.f7086l;
            int i8 = (int) j;
            if (j == i8) {
                this.k = 0;
                int[] iArr = this.f7081g;
                int i9 = this.f7078d - 1;
                iArr[i9] = iArr[i9] + 1;
                return i8;
            }
            throw new RuntimeException("Expected an int but was " + this.f7086l + " at path " + n());
        }
        if (i4 == 17) {
            long j5 = this.f7087m;
            d8.a aVar = this.j;
            aVar.getClass();
            this.f7088n = aVar.n(j5, I7.a.f2219a);
        } else if (i4 != 9 && i4 != 8) {
            if (i4 != 11) {
                throw new RuntimeException("Expected an int but was " + j.y(D()) + " at path " + n());
            }
        } else {
            if (i4 == 9) {
                W7 = W(f7083p);
            } else {
                W7 = W(f7082o);
            }
            this.f7088n = W7;
            try {
                int parseInt = Integer.parseInt(W7);
                this.k = 0;
                int[] iArr2 = this.f7081g;
                int i10 = this.f7078d - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.k = 11;
        try {
            double parseDouble = Double.parseDouble(this.f7088n);
            int i11 = (int) parseDouble;
            if (i11 == parseDouble) {
                this.f7088n = null;
                this.k = 0;
                int[] iArr3 = this.f7081g;
                int i12 = this.f7078d - 1;
                iArr3[i12] = iArr3[i12] + 1;
                return i11;
            }
            throw new RuntimeException("Expected an int but was " + this.f7088n + " at path " + n());
        } catch (NumberFormatException unused2) {
            throw new RuntimeException("Expected an int but was " + this.f7088n + " at path " + n());
        }
    }
}

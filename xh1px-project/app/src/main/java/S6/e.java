package S6;

import B6.n;
import C6.InterfaceC0011l;
import C6.T;
import I6.C;
import I7.m;
import T6.F;
import Z.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import n1.AbstractC1149a;
import o6.j;
import t0.C1530D;
import t0.C1541g;
import t0.S;
import t0.s0;
import v7.k;

/* loaded from: classes.dex */
public class e implements f {

    /* renamed from: a */
    public final /* synthetic */ int f5428a;

    /* renamed from: b */
    public int f5429b;

    /* renamed from: c */
    public final Object f5430c;

    /* renamed from: d */
    public Object f5431d;

    /* renamed from: e */
    public final Serializable f5432e;

    /* renamed from: f */
    public Object f5433f;

    public e(A4.a aVar, InterfaceC0011l interfaceC0011l, W6.e eVar, int i4) {
        this.f5428a = 0;
        j.e(aVar, "c");
        j.e(eVar, "typeParameterOwner");
        this.f5430c = aVar;
        this.f5431d = interfaceC0011l;
        this.f5429b = i4;
        ArrayList typeParameters = eVar.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i8));
            i8++;
        }
        this.f5432e = linkedHashMap;
        this.f5433f = ((k) ((a) ((A4.a) this.f5430c).f280e).f5398a).c(new n(10, this));
    }

    public static /* synthetic */ void q(e eVar, String str, int i4, String str2, int i8) {
        if ((i8 & 2) != 0) {
            i4 = eVar.f5429b;
        }
        if ((i8 & 4) != 0) {
            str2 = "";
        }
        eVar.p(i4, str, str2);
        throw null;
    }

    public String A() {
        if (z() != 1) {
            return null;
        }
        String l6 = l();
        this.f5431d = l6;
        return l6;
    }

    public int B(int i4) {
        if (i4 < ((String) this.f5433f).length()) {
            return i4;
        }
        return -1;
    }

    public int C() {
        char charAt;
        int i4 = this.f5429b;
        if (i4 == -1) {
            return i4;
        }
        String str = (String) this.f5433f;
        while (i4 < str.length() && ((charAt = str.charAt(i4)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i4++;
        }
        this.f5429b = i4;
        return i4;
    }

    public boolean D() {
        int C8 = C();
        String str = (String) this.f5433f;
        if (C8 >= str.length() || C8 == -1 || str.charAt(C8) != ',') {
            return false;
        }
        this.f5429b++;
        return true;
    }

    public void E(char c6) {
        String str;
        String str2 = (String) this.f5433f;
        int i4 = this.f5429b;
        if (i4 > 0 && c6 == '\"') {
            try {
                this.f5429b = i4 - 1;
                String m6 = m();
                this.f5429b = i4;
                if (j.a(m6, "null")) {
                    p(this.f5429b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f5429b = i4;
                throw th;
            }
        }
        String r8 = b8.j.r(b8.j.g(c6));
        int i8 = this.f5429b;
        int i9 = i8 - 1;
        if (i8 != str2.length() && i9 >= 0) {
            str = String.valueOf(str2.charAt(i9));
        } else {
            str = "EOF";
        }
        q(this, "Expected " + r8 + ", but had '" + str + "' instead", i9, null, 4);
        throw null;
    }

    public void F(View view) {
        if (((ArrayList) this.f5432e).remove(view)) {
            S s8 = (S) this.f5430c;
            s0 N8 = RecyclerView.N(view);
            if (N8 != null) {
                RecyclerView recyclerView = s8.f14786a;
                int i4 = N8.f14963p;
                if (recyclerView.R()) {
                    N8.f14964q = i4;
                    recyclerView.f8977x0.add(N8);
                } else {
                    N8.f14950a.setImportantForAccessibility(i4);
                }
                N8.f14963p = 0;
            }
        }
    }

    @Override // S6.f
    public T a(C c6) {
        j.e(c6, "javaTypeParameter");
        F f8 = (F) ((U1.c) this.f5433f).m(c6);
        if (f8 != null) {
            return f8;
        }
        return ((f) ((A4.a) this.f5430c).f281f).a(c6);
    }

    public void b(View view, int i4, boolean z8) {
        int u8;
        RecyclerView recyclerView = ((S) this.f5430c).f14786a;
        if (i4 < 0) {
            u8 = recyclerView.getChildCount();
        } else {
            u8 = u(i4);
        }
        ((C1541g) this.f5431d).e(u8, z8);
        if (z8) {
            x(view);
        }
        recyclerView.addView(view, u8);
        RecyclerView.N(view);
        ArrayList arrayList = recyclerView.f8919F;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1530D) recyclerView.f8919F.get(size)).getClass();
            }
        }
    }

    public int c(CharSequence charSequence, int i4) {
        int i8 = i4 + 4;
        if (i8 >= charSequence.length()) {
            this.f5429b = i4;
            if (i8 < charSequence.length()) {
                return c(charSequence, this.f5429b);
            }
            q(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw null;
        }
        ((StringBuilder) this.f5432e).append((char) (r(charSequence, i4 + 3) + (r(charSequence, i4) << 12) + (r(charSequence, i4 + 1) << 8) + (r(charSequence, i4 + 2) << 4)));
        return i8;
    }

    public void d(View view, int i4, ViewGroup.LayoutParams layoutParams, boolean z8) {
        int u8;
        RecyclerView recyclerView = ((S) this.f5430c).f14786a;
        if (i4 < 0) {
            u8 = recyclerView.getChildCount();
        } else {
            u8 = u(i4);
        }
        ((C1541g) this.f5431d).e(u8, z8);
        if (z8) {
            x(view);
        }
        s0 N8 = RecyclerView.N(view);
        if (N8 != null) {
            if (!N8.l() && !N8.q()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(N8);
                throw new IllegalArgumentException(AbstractC1149a.e(recyclerView, sb));
            }
            if (RecyclerView.f8901G0) {
                N8.toString();
            }
            N8.j &= -257;
        } else if (RecyclerView.f8900F0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(u8);
            throw new IllegalArgumentException(AbstractC1149a.e(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, u8, layoutParams);
    }

    public boolean e() {
        int i4 = this.f5429b;
        if (i4 == -1) {
            return false;
        }
        String str = (String) this.f5433f;
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f5429b = i4;
                if (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') {
                    return false;
                }
                return true;
            }
            i4++;
        }
        this.f5429b = i4;
        return false;
    }

    public void f(String str, int i4) {
        String str2 = (String) this.f5433f;
        if (str2.length() - i4 >= str.length()) {
            int length = str.length();
            for (int i8 = 0; i8 < length; i8++) {
                if (str.charAt(i8) != (str2.charAt(i4 + i8) | ' ')) {
                    q(this, "Expected valid boolean literal prefix, but had '" + m() + '\'', 0, null, 6);
                    throw null;
                }
            }
            this.f5429b = str.length() + i4;
            return;
        }
        q(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }

    public String g() {
        String n3;
        char c6;
        String str;
        String str2 = (String) this.f5433f;
        j('\"');
        int i4 = this.f5429b;
        int h02 = m.h0(str2, '\"', i4, 4);
        if (h02 == -1) {
            m();
            int i8 = this.f5429b;
            if (i8 != str2.length() && i8 >= 0) {
                str = String.valueOf(str2.charAt(i8));
            } else {
                str = "EOF";
            }
            q(this, A.j.p("Expected quotation mark '\"', but had '", str, "' instead"), i8, null, 4);
            throw null;
        }
        int i9 = i4;
        while (i9 < h02) {
            if (str2.charAt(i9) == '\\') {
                int i10 = this.f5429b;
                char charAt = str2.charAt(i9);
                boolean z8 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        ((StringBuilder) this.f5432e).append((CharSequence) str2, i10, i9);
                        int B8 = B(i9 + 1);
                        if (B8 != -1) {
                            int i11 = B8 + 1;
                            char charAt2 = str2.charAt(B8);
                            if (charAt2 == 'u') {
                                i11 = c(str2, i11);
                            } else {
                                if (charAt2 < 'u') {
                                    c6 = b8.e.f9258a[charAt2];
                                } else {
                                    c6 = 0;
                                }
                                if (c6 != 0) {
                                    ((StringBuilder) this.f5432e).append(c6);
                                } else {
                                    q(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                    throw null;
                                }
                            }
                            i10 = B(i11);
                            if (i10 == -1) {
                                q(this, "Unexpected EOF", i10, null, 4);
                                throw null;
                            }
                        } else {
                            q(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                    } else {
                        i9++;
                        if (i9 >= str2.length()) {
                            ((StringBuilder) this.f5432e).append((CharSequence) str2, i10, i9);
                            i10 = B(i9);
                            if (i10 == -1) {
                                q(this, "Unexpected EOF", i10, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str2.charAt(i9);
                        }
                    }
                    i9 = i10;
                    z8 = true;
                    charAt = str2.charAt(i9);
                }
                if (!z8) {
                    n3 = str2.subSequence(i10, i9).toString();
                } else {
                    n3 = n(i10, i9);
                }
                this.f5429b = i9 + 1;
                return n3;
            }
            i9++;
        }
        this.f5429b = h02 + 1;
        String substring = str2.substring(i4, h02);
        j.d(substring, "substring(...)");
        return substring;
    }

    public byte h() {
        String str = (String) this.f5433f;
        int i4 = this.f5429b;
        while (i4 != -1 && i4 < str.length()) {
            int i8 = i4 + 1;
            char charAt = str.charAt(i4);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f5429b = i8;
                return b8.j.g(charAt);
            }
            i4 = i8;
        }
        this.f5429b = str.length();
        return (byte) 10;
    }

    public byte i(byte b4) {
        String str;
        String str2 = (String) this.f5433f;
        byte h8 = h();
        if (h8 != b4) {
            String r8 = b8.j.r(b4);
            int i4 = this.f5429b;
            int i8 = i4 - 1;
            if (i4 != str2.length() && i8 >= 0) {
                str = String.valueOf(str2.charAt(i8));
            } else {
                str = "EOF";
            }
            q(this, "Expected " + r8 + ", but had '" + str + "' instead", i8, null, 4);
            throw null;
        }
        return h8;
    }

    public void j(char c6) {
        int i4 = this.f5429b;
        if (i4 != -1) {
            String str = (String) this.f5433f;
            while (i4 < str.length()) {
                int i8 = i4 + 1;
                char charAt = str.charAt(i4);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f5429b = i8;
                    if (charAt == c6) {
                        return;
                    }
                    E(c6);
                    throw null;
                }
                i4 = i8;
            }
            this.f5429b = -1;
            E(c6);
            throw null;
        }
        E(c6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0191, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0194, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0195, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0164, code lost:
    
        q(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017d, code lost:
    
        q(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0182, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0146, code lost:
    
        if (r11 != true) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0148, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0188, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0189, code lost:
    
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x019b, code lost:
    
        q(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e9, code lost:
    
        q(r21, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0101, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0104, code lost:
    
        if (r12 == r1) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0106, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0109, code lost:
    
        if (r1 == r12) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010b, code lost:
    
        if (r14 == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010f, code lost:
    
        if (r1 == (r12 - 1)) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0116, code lost:
    
        if (r20 == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0118, code lost:
    
        if (r3 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0120, code lost:
    
        if (r2.charAt(r12) != '\"') goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0122, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0125, code lost:
    
        q(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012d, code lost:
    
        q(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0132, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0133, code lost:
    
        r21.f5429b = r12;
        r1 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0137, code lost:
    
        if (r13 == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0139, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013c, code lost:
    
        if (r11 != false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013e, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014d, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0152, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0158, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0160, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0162, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        if (r14 == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018c, code lost:
    
        return r10;
     */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long k() {
        boolean z8;
        boolean z9;
        int B8 = B(C());
        String str = (String) this.f5433f;
        ?? r62 = 0;
        if (B8 < str.length() && B8 != -1) {
            if (str.charAt(B8) == '\"') {
                B8++;
                if (B8 != str.length()) {
                    z8 = true;
                } else {
                    q(this, "EOF", 0, null, 6);
                    throw null;
                }
            } else {
                z8 = false;
            }
            int i4 = B8;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            long j = 0;
            long j5 = 0;
            while (true) {
                if (i4 != str.length()) {
                    char charAt = str.charAt(i4);
                    if ((charAt == 'e' || charAt == 'E') && !z11) {
                        if (i4 != B8) {
                            i4++;
                            z10 = true;
                            z11 = true;
                        } else {
                            q(this, "Unexpected symbol " + charAt + " in numeric literal", 0, r62, 6);
                            throw r62;
                        }
                    } else {
                        if (charAt == '-' && z11) {
                            if (i4 != B8) {
                                i4++;
                                z10 = false;
                            } else {
                                q(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                                throw null;
                            }
                        } else if (charAt == '+' && z11) {
                            if (i4 != B8) {
                                i4++;
                                r62 = 0;
                                z10 = true;
                            } else {
                                q(this, "Unexpected symbol '+' in numeric literal", 0, null, 6);
                                throw null;
                            }
                        } else {
                            z9 = z8;
                            if (charAt == '-') {
                                if (i4 == B8) {
                                    i4++;
                                    z8 = z9;
                                    r62 = 0;
                                    z12 = true;
                                } else {
                                    q(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                                    throw null;
                                }
                            } else {
                                if (b8.j.g(charAt) != 0) {
                                    break;
                                }
                                i4++;
                                int i8 = charAt - '0';
                                if (i8 < 0 || i8 >= 10) {
                                    break;
                                }
                                if (z11) {
                                    j = (j * 10) + i8;
                                } else {
                                    j5 = (j5 * 10) - i8;
                                    if (j5 > 0) {
                                        q(this, "Numeric value overflow", 0, null, 6);
                                        throw null;
                                    }
                                }
                                z8 = z9;
                            }
                        }
                        r62 = 0;
                    }
                } else {
                    z9 = z8;
                    break;
                }
            }
        } else {
            q(this, "EOF", 0, null, 6);
            throw null;
        }
    }

    public String l() {
        String str = (String) this.f5431d;
        if (str != null) {
            j.b(str);
            this.f5431d = null;
            return str;
        }
        return g();
    }

    public String m() {
        String n3;
        String str = (String) this.f5433f;
        String str2 = (String) this.f5431d;
        if (str2 != null) {
            j.b(str2);
            this.f5431d = null;
            return str2;
        }
        int C8 = C();
        if (C8 < str.length() && C8 != -1) {
            byte g8 = b8.j.g(str.charAt(C8));
            if (g8 == 1) {
                return l();
            }
            if (g8 == 0) {
                boolean z8 = false;
                while (b8.j.g(str.charAt(C8)) == 0) {
                    C8++;
                    if (C8 >= str.length()) {
                        ((StringBuilder) this.f5432e).append((CharSequence) str, this.f5429b, C8);
                        int B8 = B(C8);
                        if (B8 == -1) {
                            this.f5429b = C8;
                            return n(0, 0);
                        }
                        C8 = B8;
                        z8 = true;
                    }
                }
                if (!z8) {
                    n3 = str.subSequence(this.f5429b, C8).toString();
                } else {
                    n3 = n(this.f5429b, C8);
                }
                this.f5429b = C8;
                return n3;
            }
            q(this, "Expected beginning of the string, but got " + str.charAt(C8), 0, null, 6);
            throw null;
        }
        q(this, "EOF", C8, null, 4);
        throw null;
    }

    public String n(int i4, int i8) {
        ((StringBuilder) this.f5432e).append((CharSequence) this.f5433f, i4, i8);
        StringBuilder sb = (StringBuilder) this.f5432e;
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void o(int i4) {
        int u8 = u(i4);
        ((C1541g) this.f5431d).f(u8);
        RecyclerView recyclerView = ((S) this.f5430c).f14786a;
        View childAt = recyclerView.getChildAt(u8);
        if (childAt != null) {
            s0 N8 = RecyclerView.N(childAt);
            if (N8 != null) {
                if (N8.l() && !N8.q()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(N8);
                    throw new IllegalArgumentException(AbstractC1149a.e(recyclerView, sb));
                }
                if (RecyclerView.f8901G0) {
                    N8.toString();
                }
                N8.a(256);
            }
        } else if (RecyclerView.f8900F0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(u8);
            throw new IllegalArgumentException(AbstractC1149a.e(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(u8);
    }

    public void p(int i4, String str, String str2) {
        String concat;
        j.e(str, "message");
        j.e(str2, "hint");
        if (str2.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(str2);
        }
        throw b8.j.d(i4, str + " at path: " + ((G.d) this.f5430c).c() + concat, (String) this.f5433f);
    }

    public int r(CharSequence charSequence, int i4) {
        char charAt = charSequence.charAt(i4);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        q(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public View s(int i4) {
        return ((S) this.f5430c).f14786a.getChildAt(u(i4));
    }

    public int t() {
        return ((S) this.f5430c).f14786a.getChildCount() - ((ArrayList) this.f5432e).size();
    }

    public String toString() {
        switch (this.f5428a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.f5433f);
                sb.append("', currentPosition=");
                sb.append(this.f5429b);
                sb.append(')');
                return sb.toString();
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                return ((C1541g) this.f5431d).toString() + ", hidden list:" + ((ArrayList) this.f5432e).size();
            default:
                return super.toString();
        }
    }

    public int u(int i4) {
        C1541g c1541g = (C1541g) this.f5431d;
        if (i4 < 0) {
            return -1;
        }
        int childCount = ((S) this.f5430c).f14786a.getChildCount();
        int i8 = i4;
        while (i8 < childCount) {
            int b4 = i4 - (i8 - c1541g.b(i8));
            if (b4 == 0) {
                while (c1541g.d(i8)) {
                    i8++;
                }
                return i8;
            }
            i8 += b4;
        }
        return -1;
    }

    public View v(int i4) {
        return ((S) this.f5430c).f14786a.getChildAt(i4);
    }

    public int w() {
        return ((S) this.f5430c).f14786a.getChildCount();
    }

    public void x(View view) {
        ((ArrayList) this.f5432e).add(view);
        S s8 = (S) this.f5430c;
        s0 N8 = RecyclerView.N(view);
        if (N8 != null) {
            View view2 = N8.f14950a;
            RecyclerView recyclerView = s8.f14786a;
            int i4 = N8.f14964q;
            if (i4 != -1) {
                N8.f14963p = i4;
            } else {
                N8.f14963p = view2.getImportantForAccessibility();
            }
            if (recyclerView.R()) {
                N8.f14964q = 4;
                recyclerView.f8977x0.add(N8);
            } else {
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public String y(String str) {
        j.e(str, "keyToMatch");
        int i4 = this.f5429b;
        try {
            if (h() == 6 && j.a(A(), str)) {
                this.f5431d = null;
                if (h() == 5) {
                    return A();
                }
            }
            return null;
        } finally {
            this.f5429b = i4;
            this.f5431d = null;
        }
    }

    public byte z() {
        String str = (String) this.f5433f;
        int i4 = this.f5429b;
        while (true) {
            int B8 = B(i4);
            if (B8 != -1) {
                char charAt = str.charAt(B8);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.f5429b = B8;
                    return b8.j.g(charAt);
                }
                i4 = B8 + 1;
            } else {
                this.f5429b = B8;
                return (byte) 10;
            }
        }
    }

    public e(S s8) {
        this.f5428a = 2;
        this.f5429b = 0;
        this.f5430c = s8;
        this.f5431d = new C1541g();
        this.f5432e = new ArrayList();
    }

    public e(String str) {
        this.f5428a = 1;
        j.e(str, "source");
        G.d dVar = new G.d();
        dVar.f1651c = new Object[8];
        int[] iArr = new int[8];
        for (int i4 = 0; i4 < 8; i4++) {
            iArr[i4] = -1;
        }
        dVar.f1652d = iArr;
        dVar.f1650b = -1;
        this.f5430c = dVar;
        this.f5432e = new StringBuilder();
        this.f5433f = str;
    }
}

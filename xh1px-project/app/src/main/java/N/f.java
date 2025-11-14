package N;

import A.j;
import O7.Y;
import P.p0;
import P.t0;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i.K;
import kotlinx.serialization.json.internal.JsonEncodingException;
import n.m;
import n.x;
import o.C1187f;
import o.C1197k;
import x5.p;
import x5.s;
import x5.t;

/* loaded from: classes.dex */
public class f implements x, s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3523d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3524e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3525f;

    public /* synthetic */ f(int i4, Object obj) {
        this.f3523d = i4;
        this.f3525f = obj;
    }

    @Override // n.x
    public void a(m mVar, boolean z8) {
        C1197k c1197k;
        K k = (K) this.f3525f;
        if (this.f3524e) {
            return;
        }
        this.f3524e = true;
        ActionMenuView actionMenuView = k.f11614b.f13300a.f8480d;
        if (actionMenuView != null && (c1197k = actionMenuView.f8398w) != null) {
            c1197k.c();
            C1187f c1187f = c1197k.f13289x;
            if (c1187f != null && c1187f.b()) {
                c1187f.f12712i.dismiss();
            }
        }
        k.f11615c.onPanelClosed(108, mVar);
        this.f3524e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    @Override // x5.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t0 b(View view, t0 t0Var, t tVar) {
        boolean z8;
        boolean z9;
        int i4;
        int i8;
        p0 p0Var = t0Var.f4308a;
        H.c f8 = p0Var.f(519);
        H.c f9 = p0Var.f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f3525f;
        int i9 = f8.f1849b;
        int i10 = f8.f1850c;
        int i11 = f8.f1848a;
        bottomSheetBehavior.f9985w = i9;
        boolean g8 = p.g(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (bottomSheetBehavior.f9977o) {
            int a3 = t0Var.a();
            bottomSheetBehavior.f9984v = a3;
            paddingBottom = a3 + tVar.f16223d;
        }
        if (bottomSheetBehavior.f9978p) {
            if (g8) {
                i8 = tVar.f16222c;
            } else {
                i8 = tVar.f16220a;
            }
            paddingLeft = i8 + i11;
        }
        if (bottomSheetBehavior.f9979q) {
            if (g8) {
                i4 = tVar.f16220a;
            } else {
                i4 = tVar.f16222c;
            }
            paddingRight = i4 + i10;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z10 = true;
        if (bottomSheetBehavior.f9981s && marginLayoutParams.leftMargin != i11) {
            marginLayoutParams.leftMargin = i11;
            z8 = true;
        } else {
            z8 = false;
        }
        if (bottomSheetBehavior.f9982t && marginLayoutParams.rightMargin != i10) {
            marginLayoutParams.rightMargin = i10;
            z8 = true;
        }
        if (bottomSheetBehavior.f9983u) {
            int i12 = marginLayoutParams.topMargin;
            int i13 = f8.f1849b;
            if (i12 != i13) {
                marginLayoutParams.topMargin = i13;
                if (z10) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z9 = this.f3524e;
                if (z9) {
                    bottomSheetBehavior.f9975m = f9.f1851d;
                }
                if (bottomSheetBehavior.f9977o && !z9) {
                    return t0Var;
                }
                bottomSheetBehavior.P();
                return t0Var;
            }
        }
        z10 = z8;
        if (z10) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z9 = this.f3524e;
        if (z9) {
        }
        if (bottomSheetBehavior.f9977o) {
        }
        bottomSheetBehavior.P();
        return t0Var;
    }

    public boolean c() {
        return this.f3524e;
    }

    public boolean d(CharSequence charSequence, int i4) {
        if (charSequence != null && i4 >= 0 && charSequence.length() - i4 >= 0) {
            e eVar = (e) this.f3525f;
            if (eVar == null) {
                return c();
            }
            eVar.getClass();
            char c6 = 2;
            for (int i8 = 0; i8 < i4 && c6 == 2; i8++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i8));
                f fVar = g.f3526a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                c6 = 2;
                                break;
                        }
                    }
                    c6 = 0;
                }
                c6 = 1;
            }
            if (c6 == 0) {
                return true;
            }
            if (c6 == 1) {
                return false;
            }
            return c();
        }
        throw new IllegalArgumentException();
    }

    public void e() {
        this.f3524e = false;
    }

    public void f(byte b4) {
        ((Y) this.f3525f).h(String.valueOf(b4));
    }

    public void g(char c6) {
        Y y4 = (Y) this.f3525f;
        byte[] bArr = (byte[]) y4.f4115c;
        if (c6 < 128) {
            if (bArr.length - y4.f4113a < 1) {
                y4.c();
            }
            int i4 = y4.f4113a;
            y4.f4113a = i4 + 1;
            bArr[i4] = (byte) c6;
            return;
        }
        if (c6 < 2048) {
            if (bArr.length - y4.f4113a < 2) {
                y4.c();
            }
            int i8 = y4.f4113a;
            int i9 = i8 + 1;
            y4.f4113a = i9;
            bArr[i8] = (byte) ((c6 >> 6) | 192);
            y4.f4113a = i8 + 2;
            bArr[i9] = (byte) ((c6 & '?') | 128);
            return;
        }
        if (55296 <= c6 && c6 < 57344) {
            if (bArr.length - y4.f4113a < 1) {
                y4.c();
            }
            int i10 = y4.f4113a;
            y4.f4113a = i10 + 1;
            bArr[i10] = (byte) 63;
            return;
        }
        if (c6 < 0) {
            if (bArr.length - y4.f4113a < 3) {
                y4.c();
            }
            int i11 = y4.f4113a;
            int i12 = i11 + 1;
            y4.f4113a = i12;
            bArr[i11] = (byte) 224;
            int i13 = i11 + 2;
            y4.f4113a = i13;
            bArr[i12] = (byte) (((c6 >> 6) & 63) | 128);
            y4.f4113a = i11 + 3;
            bArr[i13] = (byte) ((c6 & '?') | 128);
            return;
        }
        if (c6 <= 65535) {
            if (bArr.length - y4.f4113a < 4) {
                y4.c();
            }
            int i14 = y4.f4113a;
            int i15 = i14 + 1;
            y4.f4113a = i15;
            bArr[i14] = (byte) 240;
            int i16 = i14 + 2;
            y4.f4113a = i16;
            bArr[i15] = (byte) 128;
            int i17 = i14 + 3;
            y4.f4113a = i17;
            bArr[i16] = (byte) (((c6 >> 6) & 63) | 128);
            y4.f4113a = i14 + 4;
            bArr[i17] = (byte) ((c6 & '?') | 128);
            return;
        }
        throw new JsonEncodingException(j.l("Unexpected code point: ", c6));
    }

    @Override // n.x
    public boolean h(m mVar) {
        ((K) this.f3525f).f11615c.onMenuOpened(108, mVar);
        return true;
    }

    public void i(int i4) {
        ((Y) this.f3525f).h(String.valueOf(i4));
    }

    public void j(long j) {
        ((Y) this.f3525f).h(String.valueOf(j));
    }

    public void k(String str) {
        o6.j.e(str, "v");
        ((Y) this.f3525f).h(str);
    }

    public void l(short s8) {
        ((Y) this.f3525f).h(String.valueOf(s8));
    }

    public void m(String str) {
        int i4;
        o6.j.e(str, "value");
        Y y4 = (Y) this.f3525f;
        y4.a(0, str.length() + 2);
        char[] cArr = (char[]) y4.f4116d;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i8 = length + 1;
        int i9 = 1;
        while (i9 < i8) {
            char c6 = cArr[i9];
            byte[] bArr = b8.s.f9289b;
            if (c6 < bArr.length && bArr[c6] != 0) {
                int length2 = str.length();
                for (int i10 = i9 - 1; i10 < length2; i10++) {
                    y4.a(i9, 2);
                    char charAt = str.charAt(i10);
                    byte[] bArr2 = b8.s.f9289b;
                    if (charAt < bArr2.length) {
                        byte b4 = bArr2[charAt];
                        if (b4 == 0) {
                            i4 = i9 + 1;
                            ((char[]) y4.f4116d)[i9] = charAt;
                        } else {
                            if (b4 == 1) {
                                String str2 = b8.s.f9288a[charAt];
                                o6.j.b(str2);
                                y4.a(i9, str2.length());
                                str2.getChars(0, str2.length(), (char[]) y4.f4116d, i9);
                                i9 = str2.length() + i9;
                            } else {
                                char[] cArr2 = (char[]) y4.f4116d;
                                cArr2[i9] = '\\';
                                cArr2[i9 + 1] = (char) b4;
                                i9 += 2;
                            }
                        }
                    } else {
                        i4 = i9 + 1;
                        ((char[]) y4.f4116d)[i9] = charAt;
                    }
                    i9 = i4;
                }
                y4.a(i9, 1);
                char[] cArr3 = (char[]) y4.f4116d;
                cArr3[i9] = '\"';
                y4.i(cArr3, i9 + 1);
                y4.c();
                return;
            }
            i9++;
        }
        cArr[i8] = '\"';
        y4.i(cArr, length + 2);
        y4.c();
    }

    public String toString() {
        switch (this.f3523d) {
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (this.f3524e) {
                    return "FALL_THROUGH";
                }
                return String.valueOf(this.f3525f);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(Object obj, boolean z8, int i4) {
        this.f3523d = i4;
        this.f3525f = obj;
        this.f3524e = z8;
    }

    public f(Y y4) {
        this.f3523d = 2;
        this.f3525f = y4;
        this.f3524e = true;
    }

    public f(String str, boolean z8) {
        this.f3523d = 5;
        this.f3524e = z8;
        this.f3525f = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(e eVar, boolean z8) {
        this(0, eVar);
        this.f3523d = 0;
        this.f3524e = z8;
    }

    public void n() {
    }

    public void o() {
    }
}

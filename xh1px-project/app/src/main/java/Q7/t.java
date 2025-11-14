package Q7;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t implements c0.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4968d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4969e;

    public /* synthetic */ t(String str, int i4) {
        this.f4968d = i4;
        this.f4969e = str;
    }

    @Override // c0.r
    public boolean i(CharSequence charSequence, int i4, int i8, c0.y yVar) {
        if (TextUtils.equals(charSequence.subSequence(i4, i8), this.f4969e)) {
            yVar.f9427c = (yVar.f9427c & 3) | 4;
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.f4968d) {
            case 0:
                return A.j.q(new StringBuilder("<"), this.f4969e, '>');
            default:
                return super.toString();
        }
    }

    @Override // c0.r
    public Object a() {
        return this;
    }
}

package p0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import n0.AbstractC1143u;

/* renamed from: p0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300h extends AbstractC1143u {
    public String j;

    @Override // n0.AbstractC1143u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1300h) && super.equals(obj) && o6.j.a(this.j, ((C1300h) obj).j)) {
            return true;
        }
        return false;
    }

    @Override // n0.AbstractC1143u
    public final int hashCode() {
        int i4;
        int hashCode = super.hashCode() * 31;
        String str = this.j;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    @Override // n0.AbstractC1143u
    public final void l(Context context, AttributeSet attributeSet) {
        super.l(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1303k.f13674b);
        o6.j.d(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.j = string;
        }
        obtainAttributes.recycle();
    }

    @Override // n0.AbstractC1143u
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" class=");
        String str = this.j;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        String sb2 = sb.toString();
        o6.j.d(sb2, "toString(...)");
        return sb2;
    }
}

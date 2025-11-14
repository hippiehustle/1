package p0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import n0.AbstractC1143u;
import n0.InterfaceC1127e;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1294b extends AbstractC1143u implements InterfaceC1127e {
    public String j;

    @Override // n0.AbstractC1143u
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1294b) && super.equals(obj) && o6.j.a(this.j, ((C1294b) obj).j)) {
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
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1303k.f13673a);
        o6.j.d(obtainAttributes, "obtainAttributes(...)");
        String string = obtainAttributes.getString(0);
        if (string != null) {
            this.j = string;
        }
        obtainAttributes.recycle();
    }
}

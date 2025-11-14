package n0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123a extends AbstractC1143u {
    public Intent j;
    public String k;

    public static String m(Context context, String str) {
        if (str != null) {
            String packageName = context.getPackageName();
            o6.j.d(packageName, "getPackageName(...)");
            return I7.v.Z(str, "${applicationId}", packageName);
        }
        return null;
    }

    @Override // n0.AbstractC1143u
    public final boolean equals(Object obj) {
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1123a) && super.equals(obj)) {
            Intent intent = this.j;
            if (intent != null) {
                z8 = intent.filterEquals(((C1123a) obj).j);
            } else if (((C1123a) obj).j == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 && o6.j.a(this.k, ((C1123a) obj).k)) {
                return true;
            }
        }
        return false;
    }

    @Override // n0.AbstractC1143u
    public final int hashCode() {
        int i4;
        int hashCode = super.hashCode() * 31;
        Intent intent = this.j;
        int i8 = 0;
        if (intent != null) {
            i4 = intent.filterHashCode();
        } else {
            i4 = 0;
        }
        int i9 = (hashCode + i4) * 31;
        String str = this.k;
        if (str != null) {
            i8 = str.hashCode();
        }
        return i9 + i8;
    }

    @Override // n0.AbstractC1143u
    public final void l(Context context, AttributeSet attributeSet) {
        super.l(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC1122L.f12742a);
        o6.j.d(obtainAttributes, "obtainAttributes(...)");
        String m6 = m(context, obtainAttributes.getString(4));
        if (this.j == null) {
            this.j = new Intent();
        }
        Intent intent = this.j;
        o6.j.b(intent);
        intent.setPackage(m6);
        String string = obtainAttributes.getString(0);
        if (string != null) {
            if (string.charAt(0) == '.') {
                string = context.getPackageName() + string;
            }
            ComponentName componentName = new ComponentName(context, string);
            if (this.j == null) {
                this.j = new Intent();
            }
            Intent intent2 = this.j;
            o6.j.b(intent2);
            intent2.setComponent(componentName);
        }
        String string2 = obtainAttributes.getString(1);
        if (this.j == null) {
            this.j = new Intent();
        }
        Intent intent3 = this.j;
        o6.j.b(intent3);
        intent3.setAction(string2);
        String m8 = m(context, obtainAttributes.getString(2));
        if (m8 != null) {
            Uri parse = Uri.parse(m8);
            if (this.j == null) {
                this.j = new Intent();
            }
            Intent intent4 = this.j;
            o6.j.b(intent4);
            intent4.setData(parse);
        }
        this.k = m(context, obtainAttributes.getString(3));
        obtainAttributes.recycle();
    }

    @Override // n0.AbstractC1143u
    public final String toString() {
        ComponentName componentName;
        Intent intent = this.j;
        String str = null;
        if (intent != null) {
            componentName = intent.getComponent();
        } else {
            componentName = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (componentName != null) {
            sb.append(" class=");
            sb.append(componentName.getClassName());
        } else {
            Intent intent2 = this.j;
            if (intent2 != null) {
                str = intent2.getAction();
            }
            if (str != null) {
                sb.append(" action=");
                sb.append(str);
            }
        }
        String sb2 = sb.toString();
        o6.j.d(sb2, "toString(...)");
        return sb2;
    }
}

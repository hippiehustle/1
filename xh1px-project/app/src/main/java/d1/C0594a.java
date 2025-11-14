package d1;

import android.content.ComponentName;
import android.graphics.drawable.Drawable;
import o6.j;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594a {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f10364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10365b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f10366c;

    public C0594a(ComponentName componentName, String str, Drawable drawable) {
        j.e(str, "name");
        this.f10364a = componentName;
        this.f10365b = str;
        this.f10366c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0594a)) {
            return false;
        }
        C0594a c0594a = (C0594a) obj;
        if (j.a(this.f10364a, c0594a.f10364a) && j.a(this.f10365b, c0594a.f10365b) && j.a(this.f10366c, c0594a.f10366c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10366c.hashCode() + A.j.c(this.f10365b, this.f10364a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(componentName=" + this.f10364a + ", name=" + this.f10365b + ", icon=" + this.f10366c + ")";
    }
}

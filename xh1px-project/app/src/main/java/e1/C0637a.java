package e1;

import android.net.Uri;
import o6.j;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10594a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10595b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f10596c;

    public C0637a(Object obj, String str, Uri uri) {
        this.f10594a = obj;
        this.f10595b = str;
        this.f10596c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0637a)) {
            return false;
        }
        C0637a c0637a = (C0637a) obj;
        if (j.a(this.f10594a, c0637a.f10594a) && j.a(this.f10595b, c0637a.f10595b) && j.a(this.f10596c, c0637a.f10596c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f10594a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f10596c.hashCode() + A.j.c(this.f10595b, hashCode * 31, 31);
    }

    public final String toString() {
        return "AndroidIntentApi(value=" + this.f10594a + ", displayName=" + this.f10595b + ", helpUri=" + this.f10596c + ")";
    }
}

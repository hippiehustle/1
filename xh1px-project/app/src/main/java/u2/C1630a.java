package u2;

import android.graphics.Rect;
import j2.C0902b;
import o6.j;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1630a {

    /* renamed from: a, reason: collision with root package name */
    public final C0902b f15310a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f15311b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f15312c;

    public C1630a(C0902b c0902b, Rect rect, Rect rect2) {
        this.f15310a = c0902b;
        this.f15311b = rect;
        this.f15312c = rect2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1630a)) {
            return false;
        }
        C1630a c1630a = (C1630a) obj;
        if (j.a(this.f15310a, c1630a.f15310a) && j.a(this.f15311b, c1630a.f15311b) && j.a(this.f15312c, c1630a.f15312c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15312c.hashCode() + ((this.f15311b.hashCode() + (this.f15310a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ImageConditionScalingInfo(imageCondition=" + this.f15310a + ", imageArea=" + this.f15311b + ", detectionArea=" + this.f15312c + ")";
    }
}

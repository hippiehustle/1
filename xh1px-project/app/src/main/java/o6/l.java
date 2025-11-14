package o6;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class l implements h, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final int f13637d;

    public l(int i4) {
        this.f13637d = i4;
    }

    @Override // o6.h
    public final int d() {
        return this.f13637d;
    }

    public final String toString() {
        String h8 = v.f13643a.h(this);
        j.d(h8, "renderLambdaToString(...)");
        return h8;
    }
}

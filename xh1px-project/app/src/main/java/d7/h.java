package d7;

import g7.p;

/* loaded from: classes.dex */
public enum h implements p {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f10493d;

    h(int i4) {
        this.f10493d = i4;
    }

    @Override // g7.p
    public final int a() {
        return this.f10493d;
    }
}

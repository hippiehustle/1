package a7;

/* renamed from: a7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0457s implements g7.p {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f8219d;

    EnumC0457s(int i4) {
        this.f8219d = i4;
    }

    @Override // g7.p
    public final int a() {
        return this.f8219d;
    }
}

package r6;

import java.io.Serializable;

/* renamed from: r6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1474e extends AbstractC1473d implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public int f14418e;

    /* renamed from: f, reason: collision with root package name */
    public int f14419f;

    /* renamed from: g, reason: collision with root package name */
    public int f14420g;

    /* renamed from: h, reason: collision with root package name */
    public int f14421h;

    /* renamed from: i, reason: collision with root package name */
    public int f14422i;
    public int j;

    @Override // r6.AbstractC1473d
    public final int a(int i4) {
        return ((-i4) >> 31) & (c() >>> (32 - i4));
    }

    @Override // r6.AbstractC1473d
    public final int c() {
        int i4 = this.f14418e;
        int i8 = i4 ^ (i4 >>> 2);
        this.f14418e = this.f14419f;
        this.f14419f = this.f14420g;
        this.f14420g = this.f14421h;
        int i9 = this.f14422i;
        this.f14421h = i9;
        int i10 = ((i8 ^ (i8 << 1)) ^ i9) ^ (i9 << 4);
        this.f14422i = i10;
        int i11 = this.j + 362437;
        this.j = i11;
        return i10 + i11;
    }
}

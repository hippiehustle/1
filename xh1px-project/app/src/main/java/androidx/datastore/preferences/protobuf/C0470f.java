package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470f extends C0471g {

    /* renamed from: h, reason: collision with root package name */
    public final int f8672h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8673i;

    public C0470f(byte[] bArr, int i4, int i8) {
        super(bArr);
        C0471g.h(i4, i4 + i8, bArr.length);
        this.f8672h = i4;
        this.f8673i = i8;
    }

    @Override // androidx.datastore.preferences.protobuf.C0471g
    public final byte g(int i4) {
        int i8 = this.f8673i;
        if (((i8 - (i4 + 1)) | i4) < 0) {
            if (i4 < 0) {
                throw new ArrayIndexOutOfBoundsException(A.j.l("Index < 0: ", i4));
            }
            throw new ArrayIndexOutOfBoundsException(A.j.i(i4, i8, "Index > length: ", ", "));
        }
        return this.f8684e[this.f8672h + i4];
    }

    @Override // androidx.datastore.preferences.protobuf.C0471g
    public final void j(int i4, byte[] bArr) {
        System.arraycopy(this.f8684e, this.f8672h, bArr, 0, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.C0471g
    public final int k() {
        return this.f8672h;
    }

    @Override // androidx.datastore.preferences.protobuf.C0471g
    public final byte l(int i4) {
        return this.f8684e[this.f8672h + i4];
    }

    @Override // androidx.datastore.preferences.protobuf.C0471g
    public final int size() {
        return this.f8673i;
    }
}

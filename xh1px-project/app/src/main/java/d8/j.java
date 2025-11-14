package d8;

import a6.AbstractC0434i;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f10544a;

    /* renamed from: b, reason: collision with root package name */
    public int f10545b;

    /* renamed from: c, reason: collision with root package name */
    public int f10546c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10547d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10548e;

    /* renamed from: f, reason: collision with root package name */
    public j f10549f;

    /* renamed from: g, reason: collision with root package name */
    public j f10550g;

    public j() {
        this.f10544a = new byte[8192];
        this.f10548e = true;
        this.f10547d = false;
    }

    public final j a() {
        j jVar = this.f10549f;
        if (jVar == this) {
            jVar = null;
        }
        j jVar2 = this.f10550g;
        o6.j.b(jVar2);
        jVar2.f10549f = this.f10549f;
        j jVar3 = this.f10549f;
        o6.j.b(jVar3);
        jVar3.f10550g = this.f10550g;
        this.f10549f = null;
        this.f10550g = null;
        return jVar;
    }

    public final void b(j jVar) {
        o6.j.e(jVar, "segment");
        jVar.f10550g = this;
        jVar.f10549f = this.f10549f;
        j jVar2 = this.f10549f;
        o6.j.b(jVar2);
        jVar2.f10550g = jVar;
        this.f10549f = jVar;
    }

    public final j c() {
        this.f10547d = true;
        return new j(this.f10544a, this.f10545b, this.f10546c, true);
    }

    public final void d(j jVar, int i4) {
        o6.j.e(jVar, "sink");
        byte[] bArr = jVar.f10544a;
        if (jVar.f10548e) {
            int i8 = jVar.f10546c;
            int i9 = i8 + i4;
            if (i9 > 8192) {
                if (!jVar.f10547d) {
                    int i10 = jVar.f10545b;
                    if (i9 - i10 <= 8192) {
                        AbstractC0434i.O0(0, i10, i8, bArr, bArr);
                        jVar.f10546c -= jVar.f10545b;
                        jVar.f10545b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i11 = jVar.f10546c;
            int i12 = this.f10545b;
            AbstractC0434i.O0(i11, i12, i12 + i4, this.f10544a, bArr);
            jVar.f10546c += i4;
            this.f10545b += i4;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public j(byte[] bArr, int i4, int i8, boolean z8) {
        this.f10544a = bArr;
        this.f10545b = i4;
        this.f10546c = i8;
        this.f10547d = z8;
        this.f10548e = false;
    }
}

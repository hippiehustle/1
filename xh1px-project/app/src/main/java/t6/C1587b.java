package t6;

import a6.w;
import java.util.NoSuchElementException;

/* renamed from: t6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1587b extends w {

    /* renamed from: d, reason: collision with root package name */
    public final int f15126d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15127e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15128f;

    /* renamed from: g, reason: collision with root package name */
    public int f15129g;

    public C1587b(int i4, int i8, int i9) {
        this.f15126d = i9;
        this.f15127e = i8;
        boolean z8 = false;
        if (i9 <= 0 ? i4 >= i8 : i4 <= i8) {
            z8 = true;
        }
        this.f15128f = z8;
        this.f15129g = z8 ? i4 : i8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15128f;
    }

    @Override // a6.w
    public final int nextInt() {
        int i4 = this.f15129g;
        if (i4 == this.f15127e) {
            if (this.f15128f) {
                this.f15128f = false;
                return i4;
            }
            throw new NoSuchElementException();
        }
        this.f15129g = this.f15126d + i4;
        return i4;
    }
}

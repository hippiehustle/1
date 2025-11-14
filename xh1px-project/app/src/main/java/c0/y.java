package c0;

import P.C;
import d0.C0592a;
import d0.C0593b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f9424d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f9425a;

    /* renamed from: b, reason: collision with root package name */
    public final A4.a f9426b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f9427c = 0;

    public y(A4.a aVar, int i4) {
        this.f9426b = aVar;
        this.f9425a = i4;
    }

    public final int a(int i4) {
        C0592a b4 = b();
        int b9 = b4.b(16);
        if (b9 != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) b4.f4206g;
            int i8 = b9 + b4.f4203d;
            return byteBuffer.getInt((i4 * 4) + byteBuffer.getInt(i8) + i8 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [P.C, java.lang.Object] */
    public final C0592a b() {
        ThreadLocal threadLocal = f9424d;
        C0592a c0592a = (C0592a) threadLocal.get();
        C0592a c0592a2 = c0592a;
        if (c0592a == null) {
            ?? c6 = new C();
            threadLocal.set(c6);
            c0592a2 = c6;
        }
        C0593b c0593b = (C0593b) this.f9426b.f280e;
        int b4 = c0593b.b(6);
        if (b4 != 0) {
            int i4 = b4 + c0593b.f4203d;
            int i8 = (this.f9425a * 4) + ((ByteBuffer) c0593b.f4206g).getInt(i4) + i4 + 4;
            int i9 = ((ByteBuffer) c0593b.f4206g).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) c0593b.f4206g;
            c0592a2.f4206g = byteBuffer;
            if (byteBuffer != null) {
                c0592a2.f4203d = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                c0592a2.f4204e = i10;
                c0592a2.f4205f = ((ByteBuffer) c0592a2.f4206g).getShort(i10);
                return c0592a2;
            }
            c0592a2.f4203d = 0;
            c0592a2.f4204e = 0;
            c0592a2.f4205f = 0;
        }
        return c0592a2;
    }

    public final String toString() {
        int i4;
        int i8;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0592a b4 = b();
        int b9 = b4.b(4);
        if (b9 != 0) {
            i4 = ((ByteBuffer) b4.f4206g).getInt(b9 + b4.f4203d);
        } else {
            i4 = 0;
        }
        sb.append(Integer.toHexString(i4));
        sb.append(", codepoints:");
        C0592a b10 = b();
        int b11 = b10.b(16);
        if (b11 != 0) {
            int i9 = b11 + b10.f4203d;
            i8 = ((ByteBuffer) b10.f4206g).getInt(((ByteBuffer) b10.f4206g).getInt(i9) + i9);
        } else {
            i8 = 0;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            sb.append(Integer.toHexString(a(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}

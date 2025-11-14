package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0486w {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f8742a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f8743b;

    static {
        Charset.forName("US-ASCII");
        f8742a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8743b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0472h(bArr, 0, 0, false).e(0);
        } catch (InvalidProtocolBufferException e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}

package q1;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353a extends LruCache {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13911a = 0;

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        o6.j.e((String) obj, "key");
        o6.j.e(bitmap, "bitmap");
        return bitmap.getByteCount() / 1024;
    }
}

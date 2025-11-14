package v7;

import java.util.concurrent.ConcurrentHashMap;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class e extends U1.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f15549h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k kVar, ConcurrentHashMap concurrentHashMap, InterfaceC1163b interfaceC1163b, int i4) {
        super(kVar, concurrentHashMap, interfaceC1163b, 4);
        this.f15549h = i4;
    }

    public static /* synthetic */ void f(int i4) {
        String str;
        int i8;
        if (i4 != 3) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 3) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
                }
            } else {
                objArr[0] = "computation";
            }
        } else {
            objArr[0] = "map";
        }
        if (i4 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i4 != 2) {
            if (i4 != 3) {
                objArr[2] = "<init>";
            }
        } else {
            objArr[2] = "computeIfAbsent";
        }
        String format = String.format(str, objArr);
        if (i4 != 3) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // U1.c, n6.InterfaceC1163b
    public Object m(Object obj) {
        switch (this.f15549h) {
            case 1:
                Object m6 = super.m(obj);
                if (m6 != null) {
                    return m6;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.m(obj);
        }
    }
}

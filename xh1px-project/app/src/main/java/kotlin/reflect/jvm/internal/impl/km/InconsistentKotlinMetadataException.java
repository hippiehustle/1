package kotlin.reflect.jvm.internal.impl.km;

import o6.j;

/* loaded from: classes.dex */
public final class InconsistentKotlinMetadataException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InconsistentKotlinMetadataException(String str) {
        super(str, null);
        j.e(str, "message");
    }
}

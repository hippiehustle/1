package a0;

import java.util.Map;
import n6.InterfaceC1163b;
import o6.j;
import o6.l;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0406a extends l implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final C0406a f7660e = new l(1);

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            j.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int i4 = 0;
            for (byte b4 : bArr) {
                i4++;
                if (i4 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b4));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((C0409d) entry.getKey()).f7665a + " = " + valueOf;
    }
}

package x6;

import java.util.Arrays;
import java.util.Map;
import n6.InterfaceC1163b;

/* renamed from: x6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1801e implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public static final C1801e f16258d = new Object();

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        String obj2;
        Map.Entry entry = (Map.Entry) obj;
        o6.j.e(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            obj2 = Arrays.toString((boolean[]) value);
            o6.j.d(obj2, "toString(...)");
        } else if (value instanceof char[]) {
            obj2 = Arrays.toString((char[]) value);
            o6.j.d(obj2, "toString(...)");
        } else if (value instanceof byte[]) {
            obj2 = Arrays.toString((byte[]) value);
            o6.j.d(obj2, "toString(...)");
        } else if (value instanceof short[]) {
            obj2 = Arrays.toString((short[]) value);
            o6.j.d(obj2, "toString(...)");
        } else if (value instanceof int[]) {
            obj2 = Arrays.toString((int[]) value);
            o6.j.d(obj2, "toString(...)");
        } else if (value instanceof float[]) {
            obj2 = Arrays.toString((float[]) value);
            o6.j.d(obj2, "toString(...)");
        } else if (value instanceof long[]) {
            obj2 = Arrays.toString((long[]) value);
            o6.j.d(obj2, "toString(...)");
        } else if (value instanceof double[]) {
            obj2 = Arrays.toString((double[]) value);
            o6.j.d(obj2, "toString(...)");
        } else if (value instanceof Object[]) {
            obj2 = Arrays.toString((Object[]) value);
            o6.j.d(obj2, "toString(...)");
        } else {
            obj2 = value.toString();
        }
        return str + '=' + obj2;
    }
}

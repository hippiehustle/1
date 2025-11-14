package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f8828a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8829b;

    public C0491b(HashMap hashMap) {
        this.f8829b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0503n enumC0503n = (EnumC0503n) entry.getValue();
            List list = (List) this.f8828a.get(enumC0503n);
            if (list == null) {
                list = new ArrayList();
                this.f8828a.put(enumC0503n, list);
            }
            list.add((C0492c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0492c c0492c = (C0492c) list.get(size);
                Method method = c0492c.f8831b;
                try {
                    int i4 = c0492c.f8830a;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                method.invoke(obj, interfaceC0510v, enumC0503n);
                            }
                        } else {
                            method.invoke(obj, interfaceC0510v);
                        }
                    } else {
                        method.invoke(obj, null);
                    }
                } catch (IllegalAccessException e9) {
                    throw new RuntimeException(e9);
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException("Failed to call observer method", e10.getCause());
                }
            }
        }
    }
}

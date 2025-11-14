package H0;

import E2.c;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.buzbuz.smartautoclicker.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f1871d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f1872e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f1875c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f1874b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1873a = new HashMap();

    public a(Context context) {
        this.f1875c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f1871d == null) {
            synchronized (f1872e) {
                try {
                    if (f1871d == null) {
                        f1871d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f1871d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f1875c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f1874b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f1873a;
        if (c.e0()) {
            try {
                c.I(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                try {
                    b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> a3 = bVar.a();
                    if (!a3.isEmpty()) {
                        for (Class cls2 : a3) {
                            if (!hashMap.containsKey(cls2)) {
                                b(cls2, hashSet);
                            }
                        }
                    }
                    obj = bVar.b(this.f1875c);
                    hashSet.remove(cls);
                    hashMap.put(cls, obj);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
    }
}

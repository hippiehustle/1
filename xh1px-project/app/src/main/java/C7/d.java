package C7;

import a6.AbstractC0437l;
import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p6.InterfaceC1315a;
import w7.G;

/* loaded from: classes.dex */
public abstract class d implements Iterable, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public a f791d;

    public static String g(a aVar, int i4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i4 + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(aVar.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) G.f15953e.f14808e;
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(aVar, 10));
        int i8 = 0;
        for (Object obj : aVar) {
            int i9 = i8 + 1;
            Object obj2 = null;
            if (i8 >= 0) {
                Iterator it = concurrentHashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((Number) ((Map.Entry) next).getValue()).intValue() == i8) {
                            obj2 = next;
                            break;
                        }
                    }
                }
                sb3.append("  " + ((Map.Entry) obj2) + '[' + i8 + "]: " + obj);
                sb3.append('\n');
                arrayList.add(sb3);
                i8 = i9;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        sb.append("Content: " + A.j.q(sb3, "]", '\n'));
        sb.append('\n');
        return sb.toString();
    }

    public final boolean isEmpty() {
        if (this.f791d.g() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f791d.iterator();
    }
}

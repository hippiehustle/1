package W2;

import I7.m;
import android.graphics.Point;
import android.util.Log;
import i.AbstractC0863b;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import n1.AbstractC1149a;
import o6.j;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f6500a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6501b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6502c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6503d;

    /* renamed from: e, reason: collision with root package name */
    public int f6504e;

    public a(File file) {
        this.f6500a = file;
        ArrayList arrayList = new ArrayList();
        this.f6502c = arrayList;
        this.f6503d = arrayList;
    }

    public final void a(ZipOutputStream zipOutputStream, Object obj, Point point) {
        j.e(zipOutputStream, "zipStream");
        j.e(point, "screenSize");
        Objects.toString(obj);
        String e9 = e(obj);
        File file = this.f6500a;
        File file2 = new File(file, e9);
        if (file2.exists()) {
            Log.w("ScenarioBackupEngine", "Backup file already exists, deleting previous one");
            file2.delete();
            file2.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            g().c(b(obj, point), fileOutputStream);
            fileOutputStream.close();
            Set<String> d2 = d(obj);
            String g8 = AbstractC1149a.g(f(obj), "/");
            zipOutputStream.putNextEntry(new ZipEntry(g8));
            zipOutputStream.putNextEntry(new ZipEntry(AbstractC1149a.g(g8, file2.getName())));
            AbstractC1492c.M(zipOutputStream, file2);
            for (String str : d2) {
                zipOutputStream.putNextEntry(new ZipEntry(AbstractC1149a.g(g8, str)));
                AbstractC1492c.M(zipOutputStream, new File(file, str));
            }
            file2.delete();
        } finally {
        }
    }

    public abstract Object b(Object obj, Point point);

    public final boolean c(ZipInputStream zipInputStream, String str) {
        j.e(zipInputStream, "zipStream");
        if (i(str)) {
            Object d2 = g().d(zipInputStream);
            if (d2 == null) {
                Log.w("ScenarioBackupEngine", "Can't deserialize ".concat(str));
                this.f6504e++;
                return false;
            }
            this.f6501b.add(d2);
            return true;
        }
        if (!h(str)) {
            return false;
        }
        int m02 = m.m0(str, '/', 6) + 1;
        if (m02 <= 0) {
            Log.w("ScenarioBackupEngine", "Invalid additional file path.");
            return false;
        }
        String substring = str.substring(m02);
        j.d(substring, "substring(...)");
        File file = new File(this.f6500a, substring);
        if (file.exists()) {
            return true;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            AbstractC0863b.b(zipInputStream, fileOutputStream);
            fileOutputStream.close();
            return true;
        } finally {
        }
    }

    public abstract Set d(Object obj);

    public abstract String e(Object obj);

    public abstract String f(Object obj);

    public abstract b g();

    public abstract boolean h(String str);

    public abstract boolean i(String str);

    public void j() {
        this.f6501b.clear();
        this.f6502c.clear();
        this.f6504e = 0;
    }

    public abstract Object k(Object obj, Point point);

    public final void l(Point point) {
        j.e(point, "screenSize");
        Iterator it = this.f6501b.iterator();
        while (it.hasNext()) {
            Object k = k(it.next(), point);
            if (k != null) {
                this.f6502c.add(k);
            } else {
                this.f6504e++;
            }
        }
    }
}

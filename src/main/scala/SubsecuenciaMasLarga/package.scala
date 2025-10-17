package object SubsecuenciaMasLarga {
  type Secuencia = Seq[Int]
  type Subsecuencia = Seq[Int]

  def subindices(i: Int, n: Int): Set[Seq[Int]] = {
    if (i == n) Set(Seq())
    else if (i > n) throw new Error("i debe ser menor o igual a n")
    else {
      val sinI = subindices(i + 1, n)
      val conI = for (subsec <- sinI) yield i +: subsec
      sinI ++ conI
    }
  }

  def subSecuenciaAsoc(s: Secuencia, inds: Seq[Int]): Subsecuencia = {
    for (i <- inds) yield s(i)
  }

  def subSecuenciasDe(s: Secuencia): Set[Subsecuencia] = {
    for (inds <- subindices(0, s.length)) yield subSecuenciaAsoc(s, inds)
  }

  // Estrictamente creciente
  def incremental(s: Subsecuencia): Boolean = {
    (for {
      i <- 0 until s.length - 1
    } yield s(i) < s(i + 1)).forall(identity)
  }

  def subSecuenciasInc(s: Secuencia): Set[Subsecuencia] = {
    for {
      subsec <- subSecuenciasDe(s)
      if incremental(subsec)
    } yield subsec
  }

  
  def subsecuenciaIncrementalMasLarga(s: Secuencia): Subsecuencia = {
    if (s.isEmpty) Seq()
    else {
      val incrementales = subSecuenciasInc(s)
      (for {
        subsec <- incrementales
      } yield subsec).maxBy(_.length)
    }
  }

  def ssimlComenzandoEn(i: Int, s: Secuencia): Subsecuencia = {
    // Devuelve la subsecuencia incremental mas larga de s que comienza en s(i)
  ...
  }

  def subSecIncMasLargaV2(s: Secuencia): Subsecuencia = {
    // Devuelve una subsecuencia incremental mas larga de s
  ...
  }


  
}

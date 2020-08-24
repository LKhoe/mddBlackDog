class Organization(models.Model):
    name = models.CharField(max_length=200)
    cnpj = models.CharField(max_length=200)
            

class Project(models.Model):
    name = models.CharField(max_length=200)
    org = models.ForeignKey(Organization, on_delete=models.CASCADE)
            

class Team(models.Model):
    name = models.CharField(max_length=200)
            

class ProjectTeam(Team):
    project = models.ForeignKey(Project, on_delete=models.CASCADE)
            

class Person(models.Model):
    name = models.CharField(max_length=200)
    cpf = models.CharField(max_length=200)
            

class TeamMember(Person):
    team = models.ForeignKey(Team, on_delete=models.CASCADE)
            

